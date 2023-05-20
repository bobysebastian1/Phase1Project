package cameraRentall;

public class CameraValue {
			private int camid;
			private String brand;
			private String model;
			private float  rentperday;
			private String status;
			//adding constructors
			public CameraValue(int camid, String brand, String model, float rentperday, String status) {
				super();
				this.camid = camid;
				this.brand = brand;
				this.model = model;
				this.rentperday = rentperday;
				this.status = status;
			}
			
			// adding getters and setters
			public int getCamid() {
				return camid;
			}
			public void setCamid(int camid) {
				this.camid = camid;
			}
			public String getBrand() {
				return brand;
			}
			public void setBrand(String brand) {
				this.brand = brand;
			}
			public String getModel() {
				return model;
			}
			public void setModel(String model) {
				this.model = model;
			}
			public float getRentperday() {
				return rentperday;
			}
			public void setRentperday(float rentperday) {
				this.rentperday = rentperday;
			}
			public String getStatus() {
				return status;
			}
			public void setStatus(String status) {
				this.status = status;
			}
			public CameraValue() {
				super();
			}
			
}
