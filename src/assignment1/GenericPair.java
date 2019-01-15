package assignment1;

public class GenericPair<K extends Comparable<K>,V> implements Comparable<GenericPair<K,V>>{
	private K key;
	private V value;
	public GenericPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
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
		GenericPair<K,V> other = (GenericPair<K, V>) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		
		return true;
	}
	@Override
	public int compareTo(GenericPair<K,V> pair) {
		return key.compareTo((K) pair.getKey());
	}
	
	
}
