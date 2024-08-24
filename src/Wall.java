import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements IStructure {
    private List<IBlock> blocks;

    public Wall(List<IBlock> blocks) {
        this.blocks = blocks;
    }

    @Override
    public Optional<IBlock> findBlockByColor(String color) {
        for(IBlock block : blocks) {
            String colorString = block.getColor();
            if(colorString.contains("\n")){
                for(String colorS : colorString.split("\n")){
                    if(colorS.equals(color)){
                        return Optional.of(block);
                    }
                }
            }
            else{
                if(colorString.equals(color)){
                    return Optional.of(block);
                }
            }
        }
        return Optional.empty();
    }

    @Override
    public List<IBlock> findBlocksByMaterial(String material) {
        List<IBlock> returnBlocks = new ArrayList<>();
        for(IBlock block : blocks){
            if(block.getMaterial().contains("\n")){
                for(String materialS : block.getMaterial().split("\n")){
                    if(materialS.equals(material)){
                        returnBlocks.add(block);
                        break;
                    }
                }
            }
            else{
                if(material.equals(block.getMaterial())){
                    returnBlocks.add(block);
                }
            }
        }
        return returnBlocks;
    }

    @Override
    public int count() {
        return blocks.size();
    }
}