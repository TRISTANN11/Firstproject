package github;

public class MobilePhone {
String Manufacturer;
String Model;
String Price;
String Carrier;

public MobilePhone(String Manufacturer, String Model, String Price, String Carrier) {
	this.Manufacturer = Manufacturer;
	this.Model = Model;
	this.Price = Price;
	this.Carrier = Carrier;

}

public String call(String Number) {
	return "I am calling " + Number;
}

public String text(String Message) {
	return Message;
}

public String toString() {
	return "Manufacturer of phone: " + Manufacturer + "\nPhone Model: "+ Model + "\nPrice of phone: " + Price + "\nPhone Carrier: " + Carrier;
}
}
