public class PrivateModifier {
    public void main(String[] main) {
        Data d = new Data();
        d.setName("milind");
        System.out.println(d.getName());
    }
    class Data {
        private String name;
        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
}

