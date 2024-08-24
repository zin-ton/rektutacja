import java.util.List;

public class CompositeBlock implements ICompositeBlock{
    private List<IBlock> blocks;

    public CompositeBlock(List<IBlock> blocks) {
        this.blocks = blocks;
    }

    @Override
    public List<IBlock> getBlocks() {
        return blocks;
    }

    @Override
    public String getColor() {
        String colors = new String();
        for(IBlock block : blocks) {
            colors += block.getColor();
            colors += "\n";
        }
        return colors;
    }

    @Override
    public String getMaterial() {
        String material = new String();
        for(IBlock block : blocks) {
            material += block.getMaterial();
            material += "\n";
        }
        return material;
    }
}
