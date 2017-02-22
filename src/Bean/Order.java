package Bean;

public class Order {
	private String editionCode;
	private String pricingDuration;
	private String addonOfferingCode;
	Items[] items;
	private String[] customAttributes;
	public String getEditionCode() {
		return editionCode;
	}
	public void setEditionCode(String editionCode) {
		this.editionCode = editionCode;
	}
	public String getPricingDuration() {
		return pricingDuration;
	}
	public void setPricingDuration(String pricingDuration) {
		this.pricingDuration = pricingDuration;
	}
	public String getAddonOfferingCode() {
		return addonOfferingCode;
	}
	public void setAddonOfferingCode(String addonOfferingCode) {
		this.addonOfferingCode = addonOfferingCode;
	}
	public Items[] getItems() {
		return items;
	}
	public void setItems(Items[] items) {
		this.items = items;
	}
	public String[] getCustomAttributes() {
		return customAttributes;
	}
	public void setCustomAttributes(String[] customAttributes) {
		this.customAttributes = customAttributes;
	}
	
	

}
