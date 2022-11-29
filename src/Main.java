import java.rmi.RemoteException;
import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		Customer customer1 = new Customer(1, "Ezgi", "PubG", LocalDate.of(2000, 9, 11), Long.parseLong("11111"));
		Game game1 = new Game(1, "Assasins Creed: Valhalla", 12);
		Campaign campaign1=new Campaign(1, "Üniversite ", 10);
		
		CustomerManager customerman = new CustomerManager(new MernisServiceAdapter());
		GameManager gameman = new GameManager();
		CampaignManager campaignman = new CampaignManager();
		SalesManager salesman = new SalesManager();
		
		customerman.Add(customer1);
		gameman.Add(game1);
		campaignman.Add(campaign1);
		salesman.Sales(customer1, game1);
		salesman.SalesWithCampaign(customer1, campaign1, game1);
		
	}

}
