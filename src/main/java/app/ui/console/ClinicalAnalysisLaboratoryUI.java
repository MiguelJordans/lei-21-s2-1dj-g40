package app.ui.console;

import app.controller.ClinicalAnalysisLaboratoryController;
import app.domain.TestType;
import app.domain.TestTypeStore;
import app.ui.console.utils.Utils;

public class ClinicalAnalysisLaboratoryUI implements Runnable {

    private ClinicalAnalysisLaboratoryController ctrl;
    private TestTypeStore ttStore;

    public ClinicalAnalysisLaboratoryUI() {
        this.ctrl = new ClinicalAnalysisLaboratoryController();
        this.ttStore = new TestTypeStore();
    }

    @Override
    public void run() {
        boolean count = true;
        boolean leave = false;
        if (this.ttStore.getTestTypeList() == null || this.ttStore.getTestTypeList().isEmpty()) {
            System.out.println("The list is empty! Please, try adding at least one test type in order to create the laboratory.");
        } else {
            do {
                boolean exception = false;
                do {
                    TestType tt = (TestType) Utils.showAndSelectOne(this.ttStore.getTestTypeList(), "Select the test types");
                    this.ttStore.listAdd(tt);
                    leave = Utils.confirm("Do you wish to select more test types?");
                } while (!leave);

                do {
                    try {
                        String laboratoryID = Utils.readLineFromConsole("Please enter the laboratoryID of the Clinical Analysis Laboratory");
                        String name = Utils.readLineFromConsole("Please enter the name of the Clinical Analysis Laboratory");
                        String address = Utils.readLineFromConsole("Please enter the address of the Clinical Analysis Laboratory");
                        String phoneNumber = Utils.readLineFromConsole("Please enter the phone number of the Clinical Analysis Laboratory");
                        String TINnumber = Utils.readLineFromConsole("Please enter the TIN number of the Clinical Analysis Laboratory");

                        this.ctrl.CreateClinicalAnalysisLaboratory(laboratoryID, name, address, phoneNumber, TINnumber);
                    } catch (Exception e){
                        e.printStackTrace();
                        System.out.println("Incorrect input of data (an error has occured)! Please, try again.");
                        exception = true;
                    }
                } while (exception);

                count = Utils.confirm("Clinical Analysis Laboratory created! Do you want to save it?" + ctrl.getCAL());
                if (count) {
                    if (this.ctrl.saveClinicalAnalysisLaboratory()) {
                        System.out.println("Clinical Analysis Laboratory was saved with success!");
                    }
                }
            } while (!count);
        }
    }
}