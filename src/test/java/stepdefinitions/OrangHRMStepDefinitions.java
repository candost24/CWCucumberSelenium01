package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.OrangHRMLoginPage;
import utilitis.Driver;

import java.util.List;
import java.util.Map;

public class OrangHRMStepDefinitions {
    @Given("kullanici HRMLogin sayfasina gider")
    public void kullaniciHRMLoginSayfasinaGider() {
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");



    }

    @When("kullanici credentials girer")
    public void kullaniciCredentialsGirer(DataTable table) {
//list methodu table i parçalama
  //      List<List<String>>data=table.asLists();
  //      for (List<String>satir:data){
  //          for (String hucre:satir){
  //              System.out.println(hucre+"-");
  //          }
  //          System.out.println();
  //      }
//
  ////      String username=table.cell(1,0);
  ////      String password=table.cell(1,0);
  ////      System.out.println(username+" "+password);
  //
  //      int rowCount=table.height();
  //      int colCount=table.width();
  //
  //      for (int i=1;i<rowCount;i++){
  //          for (int j=0;j<colCount;i++){
//
  //              System.out.println(table.cell(i,j));
  //


  //          }
    //    }

        OrangHRMLoginPage lp=new OrangHRMLoginPage(Driver.getDriver());


        List<Map<String,String>>data=table.asMaps(String.class,String.class);
        for (Map<String,String>maps:data){
            String userId=maps.get("admin_id");
            String userPassword=maps.get("admin_id");
            lp.typeUsername(userId);
            lp.typeUsername(userPassword);
            lp.clickLogin();
            System.out.println(maps);//{admin_id=Admin,admin_pass=admin123}

        }
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));

   }

   @When("kullanici invalid credentials girer")
    public void kullniciInvalidCredentialsGirer(DataTable table){
       OrangHRMLoginPage lp=new OrangHRMLoginPage(Driver.getDriver());

       List<List<String>>data=table.asLists();

        for (int row=1;row< table.height();row++){
            String username= table.cell(row,0);
            String password= table.cell(row,1);
            String errorMessage= table.cell(row,2);

            lp.typeUsername(username);
            lp.typePassword(password);
            lp.clickLogin();
            lp.verifyErrMessageContains(errorMessage);




        }
   }



}
