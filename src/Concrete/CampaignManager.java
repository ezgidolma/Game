package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager  implements ICampaignService{

	@Override
	public void Add(Campaign campaign) {
		System.out.println(campaign.DiscountPercent+"indirimli "+campaign.CampaignName+"kampanyasıyla eklendi.");
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println(campaign.DiscountPercent+"indirimli "+campaign.CampaignName+"kampanyasıyla silindi.");
		
	}

	@Override
	public void Update(Campaign campaign) {
		System.out.println(campaign.DiscountPercent+"indirimli "+campaign.CampaignName+"kampanyasıyla güncellendi.");
		
	}

	
}
