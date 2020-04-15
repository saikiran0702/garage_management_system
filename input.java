import java.util.Scanner;
public class Input
{
	public static void main(String[] args)
	{
		int n,h;
		Scanner objs1 = new Scanner(System.in);
		System.out.println("Enter numbe of Vechiles: ");
		n  = objs1.nextInt();
		Vehicle[] obj = new Vehicle[n];
        for (int i = 0; i < n; i++)
        {
            obj[i] = new Vehicle();
            System.out.println("Enter 1)car 2)van 3)truck :");
            h  = objs1.nextInt();
            switch(h)
         {
            case 1:
            {
                if(obj[i].carlimit < 4)
                {
                    obj[i].carlimit++;
                    String type = "Car";
                    obj[i].setLastServiceDate(type);
                    
                    System.out.println("Enter customerID:");
            int customerid=objs1.nextInt();
            obj[i].setCustomerID(customerid);
            
            System.out.println("Enter registrationNumber:");
            String registrationnumber=objs1.next();
            obj[i].setRegistrationNumber(registrationnumber);

            System.out.println("Enter model:");
            String model=objs1.next();
            obj[i].setModel(model);

            System.out.println("Enter engineSize:");
            Double engine=objs1.nextDouble();
            obj[i].setEngineSize(engine);

            System.out.println("Enter fuelType:");
            String fuel=objs1.next();
            obj[i].setFuelType(fuel);

            System.out.println("Enter colour:");
            String colour=objs1.next();
            obj[i].setColour(colour);

            System.out.println("Enter lastServiceDate:");
            String date=objs1.next();
            obj[i].setLastServiceDate(date);

            System.out.println("Enter currentMileage:");
            int milage=objs1.nextInt();
            obj[i].setCurrentMileage(milage);

            System.out.println("Enter hasWarranty:");
            String warranty=objs1.next();
            obj[i].setHasWarranty(warranty);
                }
            else{
                 System.out.println("no space found for your car");
            }
                break;
            }
            case 2:
            {
              if(obj[i].vanlimit < 4)
                {
                    obj[i].vanlimit++;
                    String type = "Van";
                    obj[i].setLastServiceDate(type);
                    
                    System.out.println("Enter customerID:");
            int customerid=objs1.nextInt();
            obj[i].setCustomerID(customerid);
            
            System.out.println("Enter registrationNumber:");
            String registrationnumber=objs1.next();
            obj[i].setRegistrationNumber(registrationnumber);

            System.out.println("Enter model:");
            String model=objs1.next();
            obj[i].setModel(model);

            System.out.println("Enter engineSize:");
            Double engine=objs1.nextDouble();
            obj[i].setEngineSize(engine);

            System.out.println("Enter fuelType:");
            String fuel=objs1.next();
            obj[i].setFuelType(fuel);

            System.out.println("Enter colour:");
            String colour=objs1.next();
            obj[i].setColour(colour);

            System.out.println("Enter lastServiceDate:");
            String date=objs1.next();
            obj[i].setLastServiceDate(date);

            System.out.println("Enter currentMileage:");
            int milage=objs1.nextInt();
            obj[i].setCurrentMileage(milage);

            System.out.println("Enter hasWarranty:");
            String warranty=objs1.next();
            obj[i].setHasWarranty(warranty);
                }
            else{
                 System.out.println("no space found for your truck");
            }
                break;
            }
            case 3:
            {
              if(obj[i].trucklimit < 4)
                {
                    obj[i].trucklimit++;
                    String type = "Truck";
                    obj[i].setLastServiceDate(type);
                    
                    System.out.println("Enter customerID:");
            int customerid=objs1.nextInt();
            obj[i].setCustomerID(customerid);
            
            System.out.println("Enter registrationNumber:");
            String registrationnumber=objs1.next();
            obj[i].setRegistrationNumber(registrationnumber);

            System.out.println("Enter model:");
            String model=objs1.next();
            obj[i].setModel(model);

            System.out.println("Enter engineSize:");
            Double engine=objs1.nextDouble();
            obj[i].setEngineSize(engine);

            System.out.println("Enter fuelType:");
            String fuel=objs1.next();
            obj[i].setFuelType(fuel);

            System.out.println("Enter colour:");
            String colour=objs1.next();
            obj[i].setColour(colour);

            System.out.println("Enter lastServiceDate:");
            String date=objs1.next();
            obj[i].setLastServiceDate(date);

            System.out.println("Enter currentMileage:");
            int milage=objs1.nextInt();
            obj[i].setCurrentMileage(milage);

            System.out.println("Enter hasWarranty:");
            String warranty=objs1.next();
            obj[i].setHasWarranty(warranty);
                }
            else{
                 System.out.println("no space found for your truck");
            }
                break;
            }
            default:
                    System.out.println("select correct input");
        }
    }
            for (int i = 0; i < n; i++)
            {
            System.out.println("\n-----Entered details of the Vechile "+i+" is -----\n");
            System.out.println("customerID: "+obj[i].getCustomerID()+"\n");
            
            System.out.println("Vechiletype: "+obj[i].getVehicleType()+"\n");
            
            System.out.println("registrationNumber: "+obj[i].getRegistrationNumber()+"\n");

            System.out.println("model: "+obj[i].getModel()+"\n");

            System.out.println("engineSize: "+obj[i].getEngineSize()+"\n");

            System.out.println("fuelType: "+obj[i].getFuelType()+"\n");

            System.out.println("colour: "+obj[i].getColour()+"\n");

            System.out.println("lastServiceDate: "+obj[i].getLastServiceDate()+"\n");

            System.out.println("currentMileage: "+obj[i].getCurrentMileage()+"\n");

            System.out.println("hasWarranty: "+obj[i].getHasWarranty()+"\n");
            }
         }
}









