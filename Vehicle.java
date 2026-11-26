
public class Vehicle {
    private String vehicleId;
    private String registrationNumber;
    private String ownerName;
    private String vehicleType;
    private double serviceCost;
    private boolean serviceCompleted;



    Vehicle (){
        vehicleId="22046644";
        registrationNumber="000128";
        ownerName="Isabella";
        vehicleType="truck";
        serviceCost = 0.0;
        serviceCompleted = true;
    }

    public String getVehicleId(){

        return vehicleId;
    }
    public String getRegistrationNumber(){

        return registrationNumber;
    }
    public String getOwnerName(){

        return ownerName;
    }
    public String getVehicleType(){
        return vehicleType;
    }
    public double getServiceCost() {

        return serviceCost;
    }
    public boolean getServiceCompleted(){

        return serviceCompleted;
    }


    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setOwnerName(String ownerName) {

        this.ownerName = ownerName;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }


   public void startService() {
       double serviceCost = 0.0;
       boolean serviceCompleted=false;
   }
   public void addServiceCost(double amount){
        if (amount > 0 && !serviceCompleted); {
            serviceCost += amount;
       }

    }

    public void completeService(){
       if (!serviceCompleted){
         boolean serviceCompleted = false;
       }
    }


    @Override
    public String toString() {
        return "vehicleID:" + vehicleId +
                "/nRegisteration Number " + registrationNumber +
                "/nOwner Name " + ownerName +
                "/nService cost " + serviceCost +
                "/nService Completed " + serviceCompleted;

    }
}
