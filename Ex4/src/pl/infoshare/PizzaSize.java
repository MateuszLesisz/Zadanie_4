package pl.infoshare;

public enum PizzaSize {
    MAŁA {
        public String toString() {
            return "mała";
        }
    },
    ŚREDNIA{
        public String toString() {
            return"średnia";
        }
    },
    DUŻA {
        public String toString() {
            return"duża";
        }
    };
}
