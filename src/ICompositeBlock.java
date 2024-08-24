import java.util.List;

interface ICompositeBlock extends IBlock {
    List<IBlock> getBlocks();
}