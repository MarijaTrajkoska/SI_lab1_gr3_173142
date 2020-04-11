public class Receipt {
    List<Item> list;

    public Receipt (List<Item> list) {
        this.list = list;
    }

    public List<Item> getList() {
        return list;
    }

    public void setList(List<Item> list) {
        this.list = list;
    }


    public void addItem(Item item)
    {
        list.add(item);
    }

    public void removeItem(Item item)
    {
        if(list.indexOf(item) != -1)
            list.remove(list.indexOf(item));
    }

}