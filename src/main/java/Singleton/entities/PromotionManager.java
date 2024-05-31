package Singleton.entities;

public class PromotionManager {
    private static PromotionManager instance = null;
    private String name;

    private PromotionManager() {
    }

    public static PromotionManager getInstance() {
        if (instance == null) {
            instance = new PromotionManager();
        }else {
        System.out.println("ERROR : Impossible d instancier une nouvelle instance de PromotionManager");
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Responsable de promotion: " + name);
    }
}
