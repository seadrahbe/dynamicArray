
public class DynamicStringList implements StringList {
    private String[] data = new String[10];
    private int size = 0;
    

    @Override
    /**
   * Replaces the string at the specified index with the given value.
   *
   * @param index the index of the string to replace.
   * @param value the new value to set at the specified index.
   * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
   */
    public String get(int index) {
        String grabbedValue = "";
        if (index <= size && index >= 0){
            
            grabbedValue = data[index];
        } else {throw new IndexOutOfBoundsException("index cannot be higher than length of array");}

        return grabbedValue;
        

    }
    /** 
     * Replaces the string at the specified index with the given value.*
    @param index the index of the string to replace.
    @param value the new value to set at the specified index.
    @throws IndexOutOfBoundsException if the index is out of range
    */
  @Override
  public void set(int index, String value) {
    if ( index < size && index >=0) {
      data[index] = value;}
  }

  
//Adds a new string to the end of the list.*
//@param value the string to add to the list.*/
   @Override
   public void add(String value) {
    if (size == data.length){
      String[] newData = new String[data.length * 2];
      for (int i = 0; i < data.length; i++) {
          newData[i] = data[i];}

        data = newData;

    }
    data[size] = value;
    size++;

  }
  

  /**
   * Removes the string at the specified index from the list.
   *
   * @param index the index of the string to remove.
   * @return the string that was removed.
   * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
   */
  @Override
  public String remove(int index) {

    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for length " + size);
    }

    String removedString = data[index];

    for (int i = index; i < size; i++) {
      data[i] = data[i + 1];
    }

    size--;

    return removedString;
  }

  /**
   * Returns the number of strings currently in the list.
   *
   * @return the size of the list.
   */
  @Override
  public int size() {

    return size;
  }

  /**
   * Returns the current capacity of the list (i.e., the number of elements it can hold before resizing).
   *
   * @return the capacity of the list.
   */
  @Override
  public int capacity() {

    return data.length;
  }
}


