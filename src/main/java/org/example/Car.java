package org.example;

 class Car {
    private String marka;
    private String motor;
    private int model;

    private Car(String marka, String motor, int model) {
        this.marka = marka;
        this.motor = motor;
        this.model = model;
    }
     static class Builder {
        private String marka;
        private String motor;
        private int model;

        public Builder (String marka){
            this.marka = marka;

        }
        public Builder motor(String motor){
            this.motor = motor;
            return this;
        }
        public Builder model(int model){
            this.model = model;
            return this;
        }
        public Car build() {
            return new Car(marka,motor,model);
        }
    }

     public String getMarka() {
         return marka;
     }

     public int getModel() {
         return model;
     }

     public String getMotor() {
         return motor;
     }
 }

