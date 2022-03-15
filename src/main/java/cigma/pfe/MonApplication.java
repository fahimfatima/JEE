package cigma.pfe;

//import cigma.pfe.controllers.ClientController;
//import cigma.pfe.models.Client;;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class MonApplication {

    public static void main(String[] args) {
        
        // ClientController ctrl1;
        // Client client =new Client(1L,"testing");
        // Client.save(client);

        // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


       // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       // ClientController ctrl = (ClientController)
        // context.getBean("controller"); // controller est l'id dans le fichierSpring.xml


       // ApplicationContext context = new
             //   ClassPathXmlApplicationContext("spring.xml");
      //  ClientController ctrl = (ClientController)
              //  context.getBean("controller"); // controller est l'id dans le fichierSpring.xml
       // Client client = new Client(1,"fati");
        //ctrl.save(client);




        //ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
       // ClientController ctrl = (ClientController) context.getBean("controller");
//        CFactureCR fctrl = (CFactureCR) context.getBean("fcontroller");

        // Test save use case for three clients
/*
        ctrl.save(new Client("fatima"));
        ctrl.save(new Client("hikmat"));
        ctrl.save(new Client("ghita"));
        ctrl.save(new Client("anouar"));
        // Test modify use case for client with id==1
        ctrl.modify(new Client(1,"new Name"));
        // Test remove use case for client with id==1
       // ctrl.removeById(1L);
        // Test find use case for client with id==1
        Client found = ctrl.getById(1L);
*/

        //FACTURES


      //  FactureController ftrl = (FactureController) context.getBean("fcontroller");
       // ftrl.create(new Facture(new Date("01/01/2022"),10));
        //ftrl.delete(1);
       // ftrl.update(new Facture(new Date("15/12/2022"),20));
/*
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");


        ClientController ctr= (ClientController) context.getBean("controller");
        Client client = new Client("Faty");
        List<Facture> factures = Arrays.asList(new Facture(1500,"facture1"),new Facture(2000,"facture2"));
        client.setFactures(factures);

        List<Promotion> promotions= Arrays.asList(new Promotion("remise 10%"),new Promotion("solde 40%"));
        client.setPromotions(promotions);

        CarteFidelio carteFidelio = new CarteFidelio("A29930489");
        carteFidelio.setClient(client);
        client.setCarteFidelio(carteFidelio);

        ctr.save(client);


 */

        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctr= (ClientController) context.getBean("controller");
        // Test save use case for three clients
        ctr.save(new Client("Fatima"));
        ctr.save(new Client("Ghita"));
        ctr.save(new Client("Hikmat"));
        ctr.save(new Client("Anouar"));
// Test modify use case for client with id==1
        ctr.modify(new Client(3,"ALI"));
        ctr.removeById(1);
        Client client = new Client("Hind");
        List<Produit> produit = Arrays.asList(new Produit("pc",98));
        List<Adresse> adresse = Arrays.asList(new Adresse("california","Casa","Maroc",client));
        client.setAdresses(adresse);
        List<Facture> facture = Arrays.asList(
                new Facture(120, "Fct1", produit, client),
                new Facture(12,"Fct2",produit,client));
        client.setFactures(facture);
        List<Promotion> promotions=Arrays.asList(new Promotion(" la remise 10%"),new Promotion(" lesolde 40%"));
        client.setPromotions(promotions);
        CarteFidelio carteFidelio = new CarteFidelio(client, "14FH");
        carteFidelio.setClient(client);
        client.setCarteFidelio(carteFidelio);
        ctr.save(client);
        Client found = ctr.getById(2);



    }
}
