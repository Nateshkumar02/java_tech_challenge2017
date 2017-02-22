package Bean;

public class Payload {
	User user;
	Account account;
	Company company;
	Order order;
	AddOnInstance addonInstance;
	AddOnBinding addonBinding;
	Notice notice;
	Configuration configuration;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public Notice getNotice() {
		return notice;
	}
	public void setNotice(Notice notice) {
		this.notice = notice;
	}
	public Configuration getConfiguration() {
		return configuration;
	}
	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}
	public AddOnInstance getAddonInstance() {
		return addonInstance;
	}
	public void setAddonInstance(AddOnInstance addonInstance) {
		this.addonInstance = addonInstance;
	}
	public AddOnBinding getAddonBinding() {
		return addonBinding;
	}
	public void setAddonBinding(AddOnBinding addonBinding) {
		this.addonBinding = addonBinding;
	}	
}