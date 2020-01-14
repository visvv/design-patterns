package vv.dp.builder;

public class Hero {
    private String name;
    private Armor armor;
    private Hair hair;
    private Proffesion proffesion;

    private Hero(Builder builder) {
        this.name = builder.name;
        this.armor = builder.armor;
        this.hair = builder.hair;
        this.proffesion = builder.proffesion;
    }

    public String getName() {
        return name;
    }

    public Armor getArmor() {
        return armor;
    }

    public Hair getHair() {
        return hair;
    }

    public Proffesion getProffesion() {
        return proffesion;
    }

    public static class Builder {
        private final String name;
        private Armor armor;
        private Hair hair;
        private Proffesion proffesion;

        public Builder(String name) {
            if (name == null) {
                throw new IllegalArgumentException("Invalid name");
            }
            this.name = name;
        }

        public Builder withArmor(Armor armor) {
            this.armor = armor;
            return this;
        }

        public Builder withHair(Hair hair) {
            this.hair = hair;
            return this;
        }

        public Builder withProfession(Proffesion profession) {
            this.proffesion = profession;
            return this;
        }

        public Hero build() {
           return new Hero(this);
        }

    }

}
