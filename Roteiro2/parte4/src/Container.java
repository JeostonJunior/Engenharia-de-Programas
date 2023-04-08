public abstract class Container {

    protected IBorda borda;

    public Container() {
    }

    public Container(IBorda borda) {
        this.borda = borda;
    }

    public abstract void addComponent(Component c);

    public abstract void removeComponent(Component c);

    public abstract void doLayout();

    public void dispose() {
        System.out.println("Fechando o Container ");
    }
}
