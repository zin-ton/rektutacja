public class Block implements IBlock {
    private String color;
    private String material;

    public Block(String material, String color) {
        this.material = material;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }
}
