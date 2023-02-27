enum  BodyType {
    SEDAN("автомобиль легкового класса"),
    HATCHBACK("автомобиль легкового класса"),
    CROSSOVER("автомобиль класса внедорожник"),
    SUV("автомобиль класса внедорожник"),
    UNIVERSAL("автомобиль универсального класса");
    private  String type;

    BodyType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "BodyType{" +
                "type='" + type + '\'' +
                '}';
    }
}

