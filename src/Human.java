public class Human implements Jacket, Trousers, Footwear {
    String name;
    boolean jacket;
    boolean trousers;
    boolean footwear;

    public Human(String name, boolean jacket, boolean trousers, boolean footwear) {
        this.name = name;
        this.jacket = jacket;
        this.trousers = trousers;
        this.footwear = footwear;
    }

    public void putOn() {
        if (this.jacket) {
            putOnJacket();
        }
        if (this.trousers) {
            putOnTrousers();
        }
        if (this.footwear) {
            putOnFootwear();
        }
        if (this.jacket && this.trousers && this.footwear) {
            System.out.println(name + " оделся!");
        }

    }

    public void takeOff() {
        if (!this.jacket) {
            takeOffJacket();
        }
        if (!this.trousers) {
            takeOffTrousers();
        }
        if (!this.footwear) {
            takeOffFootwear();
        }
        if (!this.jacket && !this.trousers && !this.footwear) {
            System.out.println(name + " снял одежду!");
        }
    }

    @Override
    public void putOnFootwear() {
        System.out.println("Надел обувь");
    }

    @Override
    public void takeOffFootwear() {
        System.out.println("Снял обувь");
    }

    @Override
    public void putOnJacket() {
        System.out.println("Надел куртку");
    }

    @Override
    public void takeOffJacket() {
        System.out.println("Снял куртку");
    }

    @Override
    public void putOnTrousers() {
        System.out.println("Надел штаны");
    }

    @Override
    public void takeOffTrousers() {
        System.out.println("Снял штаны");
    }
}
