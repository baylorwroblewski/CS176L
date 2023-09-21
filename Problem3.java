class Car {
	public double fuelEfficiency;
	public double fuelLevel;
	
	public Car (int mileage) {
		fuelEfficiency = mileage;
	}
	
	public double fuel () {
		return fuelLevel;
	}
	public double addGas(double fuel) {
		return fuelLevel += fuel;
	}
	public double drive(double distance) {
		double totalMiles = fuelLevel * fuelEfficiency;
		double miles = totalMiles-distance;
		fuelLevel = miles/fuelEfficiency;
		return fuelLevel;
	}
	
	public double getGas() {
		return fuelLevel;
	}
	
	
}
public class Problem3 {

	public static void main(String[] args) {
		Car myCar = new Car(50);
		System.out.println("Total Gallons After Adding Fuel: " + myCar.addGas(5));
		System.out.println("Gallons Remaining After Drive: " + myCar.drive(10));
		System.out.println("Gallons in Car: " + myCar.getGas());
	}

}
