package com.springweb.Entity;
import java.util.UUID;

public class Assets {

    private  int id;
    private UUID serialNo;
    private String condition;
    private boolean available;
    private boolean assigned;
    private String assignedTo;
    private String department;
    private String manufacturer;
    private String category;
    private String model;

    public Assets(
            int id, UUID serialNo,
            String condition,
            boolean available,
            boolean assigned,
            String assignedTo,
            String department,
            String manufacturer,
            String category,
            String model) {
        this.id = id;
        this.serialNo = serialNo;
        this.condition = condition;
        this.available = available;
        this.assigned = assigned;
        this.assignedTo = assignedTo;
        this.department = department;
        this.manufacturer = manufacturer;
        this.category = category;
        this.model = model;
    }

    public Assets(){}

    //setter methods

    public void setId(int id) {
        this.id = id;
    }
    public void setSerialNo(UUID serialNo) { this.serialNo = serialNo;
    }
    public void setCondition(String condition) { this.condition = condition;
    }
    public void setAvailable(boolean available) { this.available = available;
    }
    public void setAssigned(boolean assigned) { this.assigned = assigned;
    }
    public void setAssignedTo(String assignedTo) { this.assignedTo = assignedTo;
    }
    public void setDepartment(String department) { this.department = department;
    }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer;
    }
    public void setCategory(String category) { this.category = category;
    }
    public void setModel(String model) { this.model = model;
    }

    //getter methods

    public int getId() {return id;
    }
    public UUID getSerialNo() { return serialNo; }
    public String getCondition() { return condition; }
    public boolean isAvailable() { return available;
    }
    public boolean isAssigned() { return assigned;
    }
    public String getAssignedTo() { return assignedTo;
    }
    public String getDepartment() { return department;
    }
    public String getManufacturer() { return manufacturer;
    }
    public String getCategory() { return category;
    }
    public String getModel() { return model;
    }

}
