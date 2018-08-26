import java.io.*;

class Perro implements Serializable{
	//private Collar elCollar;
	private transient Collar elCollar;
	private int tamCollar;

	public Perro(Collar collar, int tam) {
		elCollar = collar;
		tamCollar = tam;
	}

	public Collar getCollar() {
		return elCollar;
	}

	private void writeObject(ObjectOutputStream os) { // throws IOException {
		try {
			os.defaultWriteObject();
			os.writeInt(elCollar.getCollarSize());
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}

	private void readObject(ObjectInputStream is) { // throws IOException, ClassNotFoundException {
		try {
			is.defaultReadObject();
			elCollar = new Collar(is.readInt());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
