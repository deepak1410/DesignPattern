package org.corejava.features;

public class StringManipulation {

	String name;
	int id;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringManipulation other = (StringManipulation) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public void StringTest() {

		String s1 = "";
		String s2 = " World!";
		System.out.println(s1.concat(s2));
		CharSequence s3 = "hey";
		System.out.println(s3.length());

	}
	

}
