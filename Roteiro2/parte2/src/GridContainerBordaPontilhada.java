import java.util.Arrays;

public class GridContainerBordaPontilhada extends Container {

    private final Component[][] elements;
    private final int ColumnMax;
    private final int lineMax;
    private int lineCounter = 0;
    private int columnCounter = 0;

    public GridContainerBordaPontilhada(int lineMax, int ColumnMax) {
        this.lineMax = lineMax;
        this.ColumnMax = ColumnMax;
        this.elements = new Component[lineMax][ColumnMax];
    }

    @Override
    public void addComponent(Component c) {
        if (this.lineCounter == this.lineMax && this.columnCounter == this.ColumnMax) {
            System.out.println("Não é possivel adicionar novos elementos");
        } else {
            this.elements[this.lineCounter][this.columnCounter] = c;
            this.columnCounter++;
            if (columnCounter == this.ColumnMax) {
                this.lineCounter++;
                if (this.lineCounter < this.lineMax) {
                    this.columnCounter = 0;
                }
            }
        }
    }

    @Override
    public void removeComponent(Component c) {
        for (int i = 0; i < this.lineMax; i++) {
            for (int j = 0; j < this.ColumnMax; j++) {
                if (this.elements[i][j] == c) {
                    this.elements[i][i] = null;
                    break;
                }
            }
        }
    }

    @Override
    public void doLayout() {
        System.out.println("O Container utilizado é o GridContainer");
        System.out.println("Este container contêm bordas pontilhadas");
        System.out.println("Estes são os elementos presentes no container");
        System.out.println(Arrays.deepToString(elements));
        System.out.println("Usando o método dispose como herança para fechar o container");
        this.dispose();
        System.out.println("--------------------------------");
    }
}
