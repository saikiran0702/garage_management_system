import java.util.Scanner;
public class searchgarage
{
 Scanner objs11 = new Scanner(System.in);
  int ch = objs11.nextInt("enter 1)car 2)truck 3)van :\n");
                           Switch(ch)
                           {
                             case 1 :
                                         System.out.println("HERE ARE THE DETAILS OF CARS IN OUR GARAGE");
                                          for(int i=0;i<n;i++)
                                            {
                                              if(obj[i].VehicleType=="car")
                                               {
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
                                                 else
                                                 continue;
                                               }
                                              break;
                           
                                case 2 :
                                              System.out.println("HERE ARE THE DETAILS OF TRUCK IN OUR GARAGE");
                                              for(int i=0;i<n;i++)
                                               {
                                                 if(obj[i].VehicleType=="truck")
                                                  {
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
                                                  else
                                                   continue;
                                                 }
                                               break;
                              
                              case 3:
                                               System.out.println("HERE ARE THE DETAILS OF VANS IN OUR GARAGE");
                                                for(int i=0;i<n;i++)
                                                {
                                                 if(obj[i].VehicleType=="van")
                                                  {
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
                                                  else
                                                   continue;
                                                 }
                                               break;
                              
                              default :
                                              System.out.println("NOT AVAILABLE");
                                               break;

                               }
          }

