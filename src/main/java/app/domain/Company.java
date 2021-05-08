package app.domain;

import auth.AuthFacade;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 *
 * @author Paulo Maio <pam@isep.ipp.pt>
 * @author Miguel JordÃ£o <1201477@isep.ipp.pt>
 * @author Mariana Lages <1200902@isep.ipp.pt>
 * @author Lucas Silva <1200759@isep.ipp.pt>
 * @author Daniel Costa <1200581@isep.ipp.pt>
 * @author Marcin Basinski <1200300@isep.ipp.pt>
 */

public class Company {

    private final String designation;
    private final AuthFacade authFacade;

    public Company(String designation) {
        if (StringUtils.isBlank(designation))
            throw new IllegalArgumentException("Designation cannot be blank.");

        this.designation = designation;
        this.authFacade = new AuthFacade();
    }

    public String getDesignation() {
        return designation;
    }

    public AuthFacade getAuthFacade() {
        return authFacade;
    }

    public TestType createTestType(String testCode, String description, String collectingMethod,ParameterCategoryStore pcStore) {
        return new TestType(testCode, description, collectingMethod,pcStore);
    }

    public ClinicalAnalysisLaboratory createClinicalAnalysisLaboratory(String laboratoryID, String name, String address, String phoneNumber, String TINnumber) {
        return new ClinicalAnalysisLaboratory(laboratoryID, name, address, phoneNumber, TINnumber);
    }

    public Parameter createParameter(String code, String description, String name) {
        return new Parameter(code, description, name);
    }

    public ParameterCategory createParameterCategory(String code, String description, String nhsld) {
        return new ParameterCategory(code, description, nhsld);
    }

    //Test Type

    TestTypeStore testTypeStore = new TestTypeStore();

    private static TestTypeStore testTypeList;

    public static TestTypeStore TestType() {
        return testTypeList = new TestTypeStore();
    }

    //public List

    public boolean validateTestType(TestType tt) {
        testTypeStore.validateTestType(tt);
        return true;
    }

    public boolean saveTestType() {
        testTypeStore.saveTestType();
        return true;
    }

    public boolean listContainsTestType(TestType tt) {
        testTypeStore.listContain(tt);
        return true;
    }

    public boolean listAdd(TestType tt) {
        testTypeStore.listAdd(tt);
        return true;
    }

    public TestType getTestType(int i) {
        return testTypeStore.getTestType(i);
    }

    public TestType getTt() {
        return testTypeStore.getTt();
    }

    public TestTypeStore getTestTypeStore() {
        return testTypeStore;
    }

    //

    ParameterStore parameterStore = new ParameterStore();

    private static ParameterStore parameterList;

    public static ParameterStore Parameter() {
        return parameterList = new ParameterStore();
    }

    //public List

    public boolean validateParameter(Parameter pp) {
        parameterStore.validateParameter(pp);
        return true;
    }

    public boolean saveParameter() {
        parameterStore.saveParameter();
        return true;
    }

    public boolean listContainsParameter(Parameter pp) {
        parameterStore.listContain(pp);
        return true;
    }

    public boolean parameterListAdd(Parameter pp) {
        parameterStore.listAdd(pp);
        return true;
    }

    public Parameter getParameter(int i) {
        return parameterStore.getParameter(i);
    }

    public Parameter getPP() {
        return parameterStore.pp;
    }

    public ParameterStore getParameterStore() {
        return parameterStore;
    }


    //Test Type

    ParameterCategoryStore parameterCategoryStore = new ParameterCategoryStore();

    private static ParameterCategoryStore parameterCategoryList;

    public static ParameterCategoryStore ParameterCategory() {
        return parameterCategoryList = new ParameterCategoryStore();
    }

    public List<TestType> getTestType() {
        return testTypeStore.getTestTypeList();
    }

    public List<Parameter> getParameter() {
        return  parameterStore.getParameterList();
    }

    public boolean validateParameterCategory(ParameterCategory pc) {
        parameterCategoryStore.validateParameterCategory(pc);
        return true;
    }

    public boolean saveParameterCategory() {
        parameterCategoryStore.saveParameterCategory();
        return true;
    }

    public boolean listContainsParameterCategory(ParameterCategory pc) {
        parameterCategoryStore.listContain(pc);
        return true;
    }

    public boolean listAddParameterCategory(ParameterCategory pc) {
        parameterCategoryStore.listAdd();
        return true;
    }

    public ParameterCategory getParameterCategory(int i) {
        return parameterCategoryStore.getParameterCategory(i);
    }

    public ParameterCategory getPC() {
        return parameterCategoryStore.pc;
    }

    public ParameterCategoryStore getParameterCategoryStore() {
        return parameterCategoryStore;
    }


    //Clinical Analysis Laboratory

    ClinicalAnalysisLaboratoryStore clinicalAnalysisLaboratoryStore = new ClinicalAnalysisLaboratoryStore();

    private static ClinicalAnalysisLaboratoryStore clinicalAnalysisLaboratoryList;

    public static ClinicalAnalysisLaboratoryStore ClinicalAnalysisLaboratory() {
        return clinicalAnalysisLaboratoryList = new ClinicalAnalysisLaboratoryStore();
    }

    public boolean validateClinicalAnalysisLaboratory(ClinicalAnalysisLaboratory cal) {
        clinicalAnalysisLaboratoryStore.validateClinicalAnalysisLaboratory(cal);
        return true;
    }

    public boolean saveClinicalAnalysisLaboratory() {
        clinicalAnalysisLaboratoryStore.saveClinicalAnalysisLaboratory();
        return true;
    }

    public boolean listContainsClinicalAnalysisLaboratory(ClinicalAnalysisLaboratory cal) {
        clinicalAnalysisLaboratoryStore.listContain(cal);
        return true;
    }

    public boolean listAddAnalysisLaboratory(ClinicalAnalysisLaboratory cal) {
        clinicalAnalysisLaboratoryStore.listAdd(cal);
        return true;
    }

    public ClinicalAnalysisLaboratory getClinicalAnalysisLaboratory(int i) {
        return clinicalAnalysisLaboratoryStore.getClinicalAnalysisLaboratory(i);
    }

    public ClinicalAnalysisLaboratory getCal() {
        return clinicalAnalysisLaboratoryStore.cal;
    }

    public ClinicalAnalysisLaboratoryStore getClinicalAnalysisLaboratoryStore() {
        return clinicalAnalysisLaboratoryStore;
    }
}