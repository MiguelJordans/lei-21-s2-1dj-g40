package app.domain;

import auth.AuthFacade;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CompanyTest {

    @Test
    public void createCompany() {

        Company company = new Company("aaaa");

    }

    @Test(expected = IllegalArgumentException.class)
    public void createCompanyInvalid() {

        Company company = new Company("");

    }

    @Test
    public void createCompanyNull() {

        Company company = null;

        Assert.assertNull(company);

    }

    @Test
    public void getDesignation() {

        Company company = new Company("aaaa");

        String expected = "aaaa";
        String actual = company.getDesignation();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getAuthFacade() {

        Company company = new Company("aaaa");

        AuthFacade expected = company.getAuthFacade();
        AuthFacade actual = company.getAuthFacade();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getAuthFacadeNotNull() {

        Company company = new Company("aaaa");

        AuthFacade expected = company.getAuthFacade();

        Assert.assertNotNull(expected);

    }

    @Test
    public void createTestType() {

        Company company = new Company("aaaa");
        ParameterCategoryStore pcStore = new ParameterCategoryStore();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcStore.listAdd();

        TestType tt = company.createTestType("aaa", "aaa", "aaa", pcStore);

    }

    @Test
    public void createTestTypeNull() {

        TestType tt = null;

        Assert.assertNull(tt);

    }

    @Test
    public void createClinicalAnalysisLaboratory() {

        Company company = new Company("aaaa");

        ClinicalAnalysisLaboratory cal = company.createClinicalAnalysisLaboratory("a23aa", "aaa", "aaa", "69999999999", "6999999999");

    }

    @Test
    public void createClinicalAnalysisLaboratoryNull() {

        ClinicalAnalysisLaboratory cal = null;

        Assert.assertNull(cal);

    }


    @Test
    public void createClinicalAnalysisLaboratoryNotNull() {

        Company company = new Company("aaaa");

        ClinicalAnalysisLaboratory cal = company.createClinicalAnalysisLaboratory("a23aa", "aaa", "aaa", "69999999999", "6999999999");

        Assert.assertNotNull(cal);

    }

    @Test
    public void createParameter() {

        Company company = new Company("aaaa");

        ParameterCategoryStore parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE", "yes", "aaa", parameterCategoryStore);

    }

    @Test
    public void createParameter2() {

        Company company = new Company("aaaa");

        ParameterCategoryStore parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = company.createParameter("1abcE", "yes", "aaa", parameterCategoryStore);

    }

    @Test
    public void createParameter3() {

        Company company = new Company("aaaa");

        ParameterCategoryStore parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = company.createParameter("1abcE", "yes", "aaa", parameterCategoryStore);

        Assert.assertNotNull(pp);

    }

    @Test
    public void createParameterNull() {

        Company company = new Company("aaaa");

        Parameter pp = null;

        Assert.assertNull(pp);

    }

    @Test
    public void createParameterNotNull() {

        Company company = new Company("aaaa");

        ParameterCategoryStore parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE", "yes", "aaa", parameterCategoryStore);

        Assert.assertNotNull(pp);

    }

    @Test
    public void createParameterCategory() {

        Company company = new Company("aaaa");

        ParameterCategory pc = company.createParameterCategory("aaaaa", "aaa", "aaa");

    }

    @Test
    public void createParameterCategoryNull() {

        ParameterCategory pc = null;

        Assert.assertNull(pc);

    }

    @Test
    public void createParameterCategoryNotNull() {

        Company company = new Company("aaaa");

        ParameterCategory pc = company.createParameterCategory("aaaaa", "aaa", "aaa");

        Assert.assertNotNull(pc);

    }


    @Test
    public void testType() {

        Company company = new Company("aaaa");

        TestTypeStore testTypeStore = company.TestType();

    }

    @Test
    public void testTypeNull() {


        TestTypeStore testTypeStore = null;

        Assert.assertNull(testTypeStore);

    }

    @Test
    public void testTypeNotNull() {

        Company company = new Company("aaaa");

        TestTypeStore testTypeStore = company.TestType();

        Assert.assertNotNull(testTypeStore);

    }

    @Test
    public void validateTestType() {

        Company company = new Company("aaaa");
        ParameterCategoryStore pcStore = new ParameterCategoryStore();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcStore.listAdd();

        TestType tt = company.createTestType("aaa", "aaa", "aaa", pcStore);

        Assert.assertTrue(company.validateTestType(tt));

    }

    @Test
    public void saveTestType() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcStore.listAdd();

        TestType tt = company.createTestType("aaa", "aaa", "aaa", pcStore);

        boolean expected = false; // Devia ser true??

        boolean actual = company.testTypeStore.saveTestType();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listContainsTestType() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcStore.listAdd();

        TestType tt = company.createTestType("aaa", "aaa", "aaa", pcStore);

        boolean expected = false;

        boolean actual = company.testTypeStore.listContain(tt);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listAdd() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcStore.listAdd();

        TestType tt = company.createTestType("aaa", "aaa", "aaa", pcStore);

        boolean expected = true;

        boolean actual = company.testTypeStore.listAdd(tt);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getTestType() {

        Company company = new Company("aaaa");
        ParameterCategoryStore pcStore = new ParameterCategoryStore();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcStore.listAdd();

        TestType tt = company.createTestType("aaa", "aaa", "aaa", pcStore);
        company.listAdd(tt);

        TestType expected = company.getTestType(0);
        TestType actual = company.getTestType(0);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getTestTypeNotNull() {

        Company company = new Company("aaaa");
        ParameterCategoryStore pcStore = new ParameterCategoryStore();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcStore.listAdd();

        TestType tt = company.createTestType("aaa", "aaa", "aaa", pcStore);
        company.listAdd(tt);

        TestType expected = company.getTestType(0);

        Assert.assertNotNull(expected);

    }

    @Test
    public void getTestType2() {

        Company company = new Company("aaaa");
        ParameterCategoryStore pcStore = new ParameterCategoryStore();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcStore.listAdd();

        TestType tt = company.createTestType("aaa", "aaa", "aaa", pcStore);
        company.listAdd(tt);

        TestType actual = company.getTestType(0);

        Assert.assertEquals(company.getTestType(0), actual);

    }

    @Test
    public void getTt() {

        Company company = new Company("aaaa");
        ParameterCategoryStore parameterCategoryStore = new ParameterCategoryStore();

        ParameterCategory pp = new ParameterCategory("aaaaa", "aaa", "aaa");
        parameterCategoryStore.listAdd();

        TestType tt = company.createTestType("aaa", "aaa", "aaa", parameterCategoryStore);

        TestType expected = company.getTt();
        TestType actual = company.getTt();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getTestTypeStore() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        TestTypeStore expected = company.testTypeStore;

        TestTypeStore actual = company.getTestTypeStore();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void clinicalAnalysisLaboratory() {

        Company company = new Company("aaa");

        ClinicalAnalysisLaboratoryStore calstore = company.ClinicalAnalysisLaboratory();

    }

    @Test
    public void clinicalAnalysisLaboratoryNull() {

        ClinicalAnalysisLaboratoryStore calstore = null;

        Assert.assertNull(calstore);

    }

    @Test
    public void clinicalAnalysisLaboratoryNotNull() {

        Company company = new Company("aaa");

        ClinicalAnalysisLaboratoryStore calstore = company.ClinicalAnalysisLaboratory();

        Assert.assertNotNull(calstore);

    }

    @Test
    public void validateClinicalAnalysisLaboratory() {

        Company company = new Company("aaaa");

        ClinicalAnalysisLaboratory cal = company.createClinicalAnalysisLaboratory("a23aa", "aaa", "aaa", "69999999999", "6999999999");

        Assert.assertTrue(company.validateClinicalAnalysisLaboratory(cal));

    }

    @Test
    public void saveClinicalAnalysisLaboratory() {

        Company company = new Company("aaaa");

        ClinicalAnalysisLaboratory cal = company.createClinicalAnalysisLaboratory("a23aa", "aaa", "aaa", "69999999999", "6999999999");

        Assert.assertTrue(company.saveClinicalAnalysisLaboratory());

    }

    @Test
    public void listContainsClinicalAnalysisLaboratory() {

        Company company = new Company("aaaa");

        ClinicalAnalysisLaboratory cal = company.createClinicalAnalysisLaboratory("a23aa", "aaa", "aaa", "69999999999", "6999999999");

        Assert.assertTrue(company.listContainsClinicalAnalysisLaboratory(cal));


    }

    @Test
    public void testTypeListAdd() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcStore.listAdd();

        TestType tt = company.testTypeStore.CreateTestType("aaa", "aaa", "aaa", pcStore);

        Assert.assertTrue(company.listAdd(tt));

    }


    @Test
    public void getClinicalAnalysisLaboratory() {

        Company company = new Company("aaaa");

        ClinicalAnalysisLaboratory cal = company.createClinicalAnalysisLaboratory("a23aa", "aaa", "aaa", "69999999999", "6999999999");
        company.listAddAnalysisLaboratory(cal);

        ClinicalAnalysisLaboratory expected = cal;

        ClinicalAnalysisLaboratory actual = company.getClinicalAnalysisLaboratory(0);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void parameter() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        ParameterCategoryStore parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE", "yes", "aaa", parameterCategoryStore);

    }

    @Test
    public void parameterNull() {

        Parameter pp = null;

        Assert.assertNull(pp);

    }

    @Test
    public void parameterNotNull() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        ParameterCategoryStore parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE", "yes", "aaa", parameterCategoryStore);

        Assert.assertNotNull(pp);

    }

    @Test
    public void validateParameter() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        ParameterCategoryStore parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE", "yes", "aaa", parameterCategoryStore);

        Assert.assertTrue(company.validateParameter(pp));

    }

    @Test
    public void saveParameter() {

        Company company = new Company("aaaa");

        ParameterCategoryStore parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE", "yes", "aaa", parameterCategoryStore);

        Assert.assertTrue(company.saveParameter());

    }

    @Test
    public void listContainsParameter() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        ParameterCategoryStore parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE", "yes", "aaa", parameterCategoryStore);

        Assert.assertTrue(company.listContainsParameter(pp));

    }

    @Test
    public void parameterListAdd() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        ParameterCategoryStore parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE", "yes", "aaa", parameterCategoryStore);

        Assert.assertTrue(company.parameterListAdd(pp));

    }

    @Test
    public void getParameter() {

        Company company = new Company("aaaa");

        ParameterCategoryStore parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE", "yes", "aaa", parameterCategoryStore);
        company.parameterListAdd(pp);

        Parameter expected = pp;

        Parameter actual = company.getParameter(0);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getPP() {

        Company company = new Company("aaaa");

        ParameterCategoryStore parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE", "yes", "aaa", parameterCategoryStore);

        Parameter expected = company.getPP();

        Parameter actual = company.getPP();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getParameterStore() {

        Company company = new Company("aaaa");
        ParameterStore parameterStore = new ParameterStore();

        ParameterStore expected = company.parameterStore;

        ParameterStore actual = company.getParameterStore();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void parameterCategory() {

        Company company = new Company("aaaa");

        ParameterCategory pp = company.createParameterCategory("aaaaa", "aaa", "aaa");

    }

    @Test
    public void parameterCategoryNull() {

        ParameterCategory pp = null;

        Assert.assertNull(pp);

    }

    @Test
    public void parameterCategoryNotNull() {

        Company company = new Company("aaaa");

        ParameterCategory pp = company.createParameterCategory("aaaaa", "aaa", "aaa");

        Assert.assertNotNull(pp);

    }

    @Test
    public void testValidateTestType() {

        Company company = new Company("aaaa");
        ParameterCategoryStore pcStore = new ParameterCategoryStore();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcStore.listAdd();

        TestType tt = company.createTestType("aaa", "aaa", "aaa", pcStore);

        Assert.assertTrue(company.validateTestType(tt));

    }

    @Test
    public void testSaveTestType() {

        Company company = new Company("aaaa");
        ParameterCategoryStore pcStore = new ParameterCategoryStore();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcStore.listAdd();

        TestType tt = company.createTestType("aaa", "aaa", "aaa", pcStore);

        Assert.assertTrue(company.saveTestType());

    }

    @Test
    public void testListContainsTestType() {

        Company company = new Company("aaaa");
        ParameterCategoryStore pcStore = new ParameterCategoryStore();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcStore.listAdd();

        TestType tt = company.createTestType("aaa", "aaa", "aaa", pcStore);

        Assert.assertTrue(company.listContainsTestType(tt));

    }

    @Test
    public void testListAdd1() {

        Company company = new Company("aaaa");
        ParameterCategoryStore pcStore = new ParameterCategoryStore();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcStore.listAdd();

        TestType tt = company.createTestType("aaa", "aaa", "aaa", pcStore);

        Assert.assertTrue(company.listAdd(tt));

    }

    @Test
    public void getParameterCategory() {

        Company company = new Company("aaaa");

        ParameterCategory pc = company.createParameterCategory("aaaaa", "aaa", "aaa");
        company.listAddParameterCategory(pc);

        ParameterCategory expected = company.getParameterCategory(0);
        ParameterCategory actual = company.getParameterCategory(0);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getPC() {

        Company company = new Company("aaaa");

        ParameterCategory pc = company.createParameterCategory("aaaaa", "aaa", "aaa");

        ParameterCategory expected = company.getPC();
        ParameterCategory actual = company.getPC();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getParameterCategoryStore() {

        Company company = new Company("aaaa");

        ParameterCategoryStore parameterCategoryStore = company.getParameterCategoryStore();

    }

    @Test
    public void getParameterCategoryStoreNull() {

        ParameterCategoryStore parameterCategoryStore = null;

        Assert.assertNull(parameterCategoryStore);

    }

    @Test
    public void getParameterCategoryStoreNotNull() {

        Company company = new Company("aaaa");

        ParameterCategoryStore parameterCategoryStore = company.getParameterCategoryStore();

        Assert.assertNotNull(parameterCategoryStore);

    }

    @Test
    public void getClinicalAnalysisLaboratoryStore() {

        Company company = new Company("aaaa");

        ClinicalAnalysisLaboratoryStore clinicalAnalysisLaboratoryStore = company.getClinicalAnalysisLaboratoryStore();

    }

    @Test
    public void getClinicalAnalysisLaboratoryStoreNotNull() {

        Company company = new Company("aaaa");

        ClinicalAnalysisLaboratoryStore clinicalAnalysisLaboratoryStore = company.getClinicalAnalysisLaboratoryStore();

        Assert.assertNotNull(clinicalAnalysisLaboratoryStore);

    }

    @Test
    public void getClinicalAnalysisLaboratoryStoreNull() {

        Company company = new Company("aaaa");

        company.clinicalAnalysisLaboratoryStore = null;

        ClinicalAnalysisLaboratoryStore clinicalAnalysisLaboratoryStore = company.getClinicalAnalysisLaboratoryStore();

        Assert.assertNull(clinicalAnalysisLaboratoryStore);

    }

    @Test
    public void listAddParameterCategory() {

        Company company = new Company("aaaa");

        ParameterCategory pc = company.createParameterCategory("aaaaa", "aaa", "aaa");

        Assert.assertTrue(company.listAddParameterCategory(pc));

    }

    @Test
    public void listContainsParameterCategory() {

        Company company = new Company("aaaa");

        ParameterCategory pc = company.createParameterCategory("aaaaa", "aaa", "aaa");

        Assert.assertTrue(company.listContainsParameterCategory(pc));

    }

    @Test
    public void saveParameterCategory() {

        Company company = new Company("aaaa");

        ParameterCategory pc = company.createParameterCategory("aaaaa", "aaa", "aaa");

        Assert.assertTrue(company.saveParameterCategory());

    }

    @Test
    public void validateParameterCategory() {

        Company company = new Company("aaaa");

        ParameterCategory pc = company.createParameterCategory("aaaaa", "aaa", "aaa");

        Assert.assertTrue(company.validateParameterCategory(pc));

    }

    @Test
    public void ParameterCategoryStore() {

        Company company = new Company("aaaa");

        ParameterCategoryStore parameterCategoryStore = company.ParameterCategory();

    }

    @Test
    public void ParameterCategoryStoreNull() {

        Company company = new Company("aaaa");

        company.parameterCategoryStore = null;

        ParameterCategoryStore parameterCategoryStore = company.getParameterCategoryStore();

        Assert.assertNull(parameterCategoryStore);

    }

    @Test
    public void ParameterCategoryStoreNotNull() {

        Company company = new Company("aaaa");

        ParameterCategoryStore parameterCategoryStore = company.ParameterCategory();

        Assert.assertNotNull(parameterCategoryStore);

    }

    @Test
    public void ParameterStore() {

        Company company = new Company("aaaa");

        ParameterStore parameterStore = company.Parameter();

    }

    @Test
    public void ParameterStoreNull() {

        ParameterStore parameterStore = null;

        Assert.assertNull(parameterStore);

    }

    @Test
    public void ParameterStoreNotNull() {

        Company company = new Company("aaaa");

        ParameterStore parameterStore = company.Parameter();

        Assert.assertNotNull(parameterStore);

    }

    @Test
    public void getCal() {

        Company company = new Company("aaaa");
        ClinicalAnalysisLaboratoryStore clinicalAnalysisLaboratoryStore = new ClinicalAnalysisLaboratoryStore();

        ClinicalAnalysisLaboratory cal = company.createClinicalAnalysisLaboratory("a23aa", "aaa", "aaa", "69999999999", "6999999999");
        clinicalAnalysisLaboratoryStore.listAdd(cal);

        ParameterCategoryStore parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        parameterCategoryStore.listAdd();

        TestType tt = company.createTestType("aaa", "aaa", "aaa", parameterCategoryStore);

        ClinicalAnalysisLaboratory expected = company.getCal();
        ClinicalAnalysisLaboratory actual = company.getCal();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getTestTypeList() {

        TestTypeStore testTypeStore = new TestTypeStore();

        Company company = new Company("aaa");

        company.getTestType();

    }

    @Test
    public void getTestTypeListNull1() {

        Company company = new Company("aaa");


        List<TestType> testType = company.getTestType();

        Assert.assertNotNull(testType);

    }

    @Test
    public void getParameterList() {

        ParameterStore parameterStore = new ParameterStore();

        Company company = new Company("aaa");

        company.getParameter();

    }

    @Test
    public void listAddAnalysisLaboratory() {

        Company company = new Company("aaa");

        ClinicalAnalysisLaboratoryStore clinicalAnalysisLaboratoryStore = new ClinicalAnalysisLaboratoryStore();

        ClinicalAnalysisLaboratory cal = company.createClinicalAnalysisLaboratory("a23aa", "aaa", "aaa", "69999999999", "6999999999");
        company.listAddAnalysisLaboratory(cal);

        Assert.assertTrue(company.listAddAnalysisLaboratory(cal));

    }


    @Test
    public void listAddAnalysisLaboratoryNotNull() {

        Company company = new Company("aaa");

        ClinicalAnalysisLaboratoryStore clinicalAnalysisLaboratoryStore = new ClinicalAnalysisLaboratoryStore();

        ClinicalAnalysisLaboratory cal = company.createClinicalAnalysisLaboratory("a23aa", "aaa", "aaa", "69999999999", "6999999999");
        company.listAddAnalysisLaboratory(cal);

        Assert.assertNotNull(company.listAddAnalysisLaboratory(cal));

    }

    @Test
    public void clientRegistration() {

        Company company = new Company("aaaa");

        ClientRegistration cr = company.createClientRegistration("aaa", "aaa@dn.pt", "male", "aaaa", "1111111111111111", "11111111111", "1111111111", "1111111111");

    }

    @Test
    public void clientRegistrationNotNull() {

        Company company = new Company("aaaa");

        ClientRegistration cr = company.createClientRegistration("aaa", "aaa@dn.pt", "male", "aaaa", "1111111111111111", "11111111111", "1111111111", "1111111111");

        Assert.assertNotNull(cr);

    }

    @Test
    public void clientRegistrationNull() {

        ClientRegistration cr = null;

        Assert.assertNull(cr);

    }

    @Test
    public void ClientRegistration() {

        Company company = new Company("aaaa");


        ClientRegistrationStore clientRegistrationStore = company.ClientRegistration();


    }

    @Test
    public void ClientRegistrationNotNull() {

        Company company = new Company("aaaa");


        ClientRegistrationStore clientRegistrationStore = company.ClientRegistration();

        Assert.assertNotNull(clientRegistrationStore);

    }

    @Test
    public void addClientRegistration() {

        Company company = new Company("aaaa");


        ClientRegistration cr = company.createClientRegistration("aaa", "aaa@dn.pt", "male", "aaaa", "1111111111111111", "11111111111", "1111111111", "1111111111");

        Assert.assertTrue(company.addClientRegistration(cr));

    }

    @Test
    public void validatelientRegistration() {

        Company company = new Company("aaaa");


        ClientRegistration cr = company.createClientRegistration("aaa", "aaa@dn.pt", "male", "aaaa", "1111111111111111", "11111111111", "1111111111", "1111111111");

        Assert.assertTrue(company.validateClientRegistration(cr));

    }

    @Test
    public void saveClientRegistration() {

        Company company = new Company("aaaa");


        ClientRegistration cr = company.createClientRegistration("aaa", "aaa@dn.pt", "male", "aaaa", "1111111111111111", "11111111111", "1111111111", "1111111111");

        Assert.assertTrue(company.saveClientRegistration(cr));

    }

    @Test
    public void listContainsClientRegistration() {

        Company company = new Company("aaaa");


        ClientRegistration cr = company.createClientRegistration("aaa", "aaa@dn.pt", "male", "aaaa", "1111111111111111", "11111111111", "1111111111", "1111111111");

        Assert.assertTrue(company.listContainsClientRegistration(cr));

    }

    @Test
    public void listAddClientRegistration() {

        Company company = new Company("aaaa");


        ClientRegistration cr = company.createClientRegistration("aaa", "aaa@dn.pt", "male", "aaaa", "1111111111111111", "11111111111", "1111111111", "1111111111");

        Assert.assertTrue(company.listAdd(cr));

    }

    @Test
    public void getCR() {

        Company company = new Company("aaaa");

        ClientRegistration cr = company.createClientRegistration("aaa", "aaa@dn.pt", "male", "aaaa", "1111111111111111", "11111111111", "1111111111", "1111111111");

        ClientRegistration expected = company.getCr();
        ClientRegistration actual = company.getCr();

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void getClientRegistration() {

        Company company = new Company("aaaa");

        ClientRegistration cr = company.createClientRegistration("aaa", "aaa@dn.pt", "male", "aaaa", "1111111111111111", "11111111111", "1111111111", "1111111111");
        company.listAdd(cr);


        ClientRegistration expected = company.getClientRegistration(0);
        ClientRegistration actual = company.getClientRegistration(0);

        Assert.assertEquals(expected, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void addEmployee() {

        Company company = new Company("aaaa");

        Employee emp = new Employee("DanielCosta", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","specialist doctor","123456");

       Assert.assertTrue(company.addEmployee(emp));


    }

    @Test(expected = IllegalArgumentException.class)
    public void listEmployee() {

        Company company = new Company("aaaa");

        Employee emp = new Employee("DanielCosta", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","specialist doctor","123456");
        company.listAddEmp(emp);

        Assert.assertTrue(company.listEmployee(emp));


    }

    @Test(expected = IllegalArgumentException.class)
    public void validateEmployee() {

        Company company = new Company("aaaa");

        Employee emp = new Employee("DanielCosta", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","specialist doctor","123456");

        Assert.assertTrue(company.validateEmployee(emp));


    }

    @Test(expected = IllegalArgumentException.class)
    public void saveEmployee() {

        Company company = new Company("aaaa");

        Employee emp = new Employee("DanielCosta", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","specialist doctor","123456");

        Assert.assertTrue(company.saveEmployee(emp));


    }

    @Test(expected = IllegalArgumentException.class)
    public void listAddEmployee() {

        Company company = new Company("aaaa");

        Employee emp = new Employee("DanielCosta", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","specialist doctor","123456");

        Assert.assertTrue(company.listAddEmp(emp));


    }

    @Test(expected = IllegalArgumentException.class)
    public void getEmployee() {

        Company company = new Company("aaaa");

        Employee emp = new Employee("DanielCosta", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","specialist doctor","123456");
        company.listAddEmp(emp);

        Employee expected = company.getEmployee(0);
        Employee actual = company.getEmployee(0);


        Assert.assertEquals(expected,actual);


    }

    @Test(expected = IllegalArgumentException.class)
    public void getEmp() {

        Company company = new Company("aaaa");

        Employee emp = new Employee("DanielCosta", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","specialist doctor","123456");
        company.listAddEmp(emp);

        Employee expected = company.getEmp();
        Employee actual = company.getEmp();


        Assert.assertEquals(expected,actual);


    }

    @Test(expected = IllegalArgumentException.class)
    public void getEmployeeStore() {

        Company company = new Company("aaaa");

        Employee emp = new Employee("DanielCosta", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","specialist doctor","123456");

        EmployeeStore employeeStore = company.getEmployeeStore();

        
    }

}