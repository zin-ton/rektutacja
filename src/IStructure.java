import java.util.List;
import java.util.Optional;

interface IStructure {
    // zwraca dowolny element o podanym kolorze
    Optional<IBlock> findBlockByColor(String color);

    // zwraca wszystkie elementy z danego materiału
    List<IBlock> findBlocksByMaterial(String material);

    //zwraca liczbę wszystkich elementów tworzących strukturę
    int count();
}
