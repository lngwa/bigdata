package assignment1;

public class Pair implements Comparable<Pair>{
	private String key;
	private int value;
	public Pair(String key, int value) {
		this.key = key;
		this.value = value;
	}
	public String getKey() {
		return key;
	}
	public int getValue() {
		return value;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + value;
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
		Pair other = (Pair) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value != other.value)
			return false;
		return true;
	}
	@Override
	public int compareTo(Pair pair) {
		return key.compareToIgnoreCase(pair.key);
	}
	
	
}
