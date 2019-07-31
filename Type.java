
public class Type {
	private String unipedal, bipedal, quadrupedal, 
					arachnid, radial, aeronautical;
	private String type;
	
	public Type (String type) {
		if (type.equals("unipedal")){
			this.type = unipedal;
		} else if (type.equals("bipedal")) {
			this.type = bipedal;
		} else if (type.equals("quadrupedal")) {
			this.type = quadrupedal;
		} else if (type.equals("arachnid")) {
			this.type = arachnid;
		} else if (type.equals("radial")) {
			this.type = radial;
		} else if (type.equals("aeronautical")) {
			this.type = aeronautical;
		} else {
			this.type = type;
			System.out.println("Creating new type: " + type);
		}
	}
}
