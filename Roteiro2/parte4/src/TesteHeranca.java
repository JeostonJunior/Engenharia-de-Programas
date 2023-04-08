// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TesteHeranca {
    public static void main(String[] args) {
        Component button = new Component("Button");
        Component textBox = new Component("TextBox");
        Component textField = new Component("TextField");
        Component checkBox = new Component("CheckBox");
        Component combobox = new Component("ComboBox");
        Component label = new Component("Label");
        Component radiobutton = new Component("RadioButton");

        // Criando um GridContainer para adicionar os elementos
        Container c1 = new GridContainer(2, 2);
        c1.addComponent(button);
        c1.addComponent(textBox);
        c1.addComponent(textField);
        c1.addComponent(checkBox);

        c1.doLayout();
        System.out.println(" ************************ ");

        // Criando um GridContainer com Bordas Solidas para adicionar os elementos
        Container c5 = new GridContainer(2, 2, new BordaSolida());
        c5.addComponent(radiobutton);
        c5.addComponent(label);
        c5.addComponent(combobox);
        c5.addComponent(textField);
        c5.doLayout();

        // Criando um GridContainer com Bordas Pontilhadas para adicionar os elementos
        Container c6 = new GridContainer(2, 2, new BordaPontilhada());
        c6.addComponent(radiobutton);
        c6.addComponent(label);
        c6.addComponent(combobox);
        c6.addComponent(textField);
        c6.doLayout();


        // Criando um FlowContainer para adicionar os elementos
        Container c2 = new FlowContainer();
        c2.addComponent(combobox);
        c2.addComponent(label);
        c2.addComponent(radiobutton);
        c2.doLayout();
        System.out.println(" ************************ ");

        // Criando um FlowContainer com Pordas Pontilhadas para adicionar os elementos
        Container c3 = new FlowContainer(new BordaPontilhada());
        c3.addComponent(radiobutton);
        c3.addComponent(label);
        c3.addComponent(combobox);
        c3.doLayout();
        System.out.println(" ************************ ");

        // Criando um FlowContainer com Bordas Solidas para adicionar os elementos
        Container c4 = new FlowContainer(new BordaSolida());
        c4.addComponent(radiobutton);
        c4.addComponent(label);
        c4.addComponent(combobox);
        c4.doLayout();


    }
}
