package labs_examples.datastructures.hashmap.labs;

/**
 *      HashMaps Exercise_02
 *
 *      Rewrite the CustomHashMap class to meet the following requirements:
 *      1) no method has the same name as any in CustomHashMap (DONE)
 *          (do not use refactor - do it manually)
 *      2) no variable has the same name as any in CustomHashMap (DONE)
 *          (do not use refactor - do it manually)
 *      3) resize the HashMap when the underlying array is more than half full (DONE)
 *      4) triple the size of the underlying array on resize() (DONE)
 *      5) instead of checking the number of keys to resize, check the number of values
 *      6) on collisions, add new elements to the front of the LinkedList, not the end (DONE)
 *      7) anytime someone tries to get/update/remove an element that does not exist, print (DONE)
 *          out a message indicating that the element does not exist
 *      8) add at least one more method that you think could be useful to the HashMap
 *          review Java's built-in HashMap for inspiration (DONE)
 */
class Exercise_02 <K, V> {

    private Entry<K, V>[] bucket = new Entry[10];

    private int elements = 0;

    private int hashM(K key) {
        // get the hashCode for the key and mod that hashCode by the length of the array
        int index = Math.abs(key.hashCode() % bucket.length);
        // the result will be the index where we can find and/or place entries
        return index;
    }
    public void putIn(K key, V value) {
        // call the hash() method to get the index to place the element
        int index = hashM(key);

        // create the Entry object containing the key and value that we will store in the underlying array
       Entry<K,V> entry = new Entry(key, value);

        // no element at the given index, means no collision
        // go ahead and simply add the value to the array
        if (bucket[index] == null) {

            bucket[index] = entry;
            elements++;
        }
        // otherwise, there was a collision
        // we need iterate through the linked list at that index
        else {
            // get the first Entry (in the linked list) at the given index
            Entry<K, V> p = bucket[index];

            // traverse the linked list
            while (p.next != null) {
                p = p.next;
            }

            // after we exit the while loop above, we'll be at the end of the linked list
            // this is where we can add the new Entry
            bucket[0] = entry;
            elements++;
        }

        // check for resize
        if (elements > bucket.length * .50) {
            // the resize method will create a bigger underlying array and
            // add all values in the existing array to the new, larger array
            resizeBucket();
        }
    }
    private void resizeBucket() {
        // make a copy of the existing table and call it "old"
        Entry<K, V>[] old = bucket;
        // create a new Entry[] that is twice the size of the old one
        bucket = new Entry[old.length * 3];

        // iterate over the length of the old array
        for (int i = 0; i < old.length; i++) {
            try {
                // get the Entry at the index of "i" from the "old" table
                Entry entry = old[i];
                // call the put() method passing the key and value to add this element to the new table
                putIn((K) entry.getKey(), (V) entry.getValue());

                // check to see if this entry is actually the start of a linked list
                while (entry.next != null) {
                    // if it is, traverse to the next node
                    entry = entry.next;
                    // and call the put() method to add this element
                    putIn((K) entry.getKey(), (V) entry.getValue());
                    // loop
                }
            } catch (Exception e) {
                // do nothing - this is just to handle empty indexes
            }
        }
    }
    public void removeItem(K key) {

        // ensure key exists by calling the get() method
        if (getKey(key) == null) {
            // if the get() method returns null, there's nothing to delete
            System.out.println("element is not present");
            return;
        }

        // otherwise, get the index for the key by calling the hash() method
        int index = hashM(key);

        // get the Entry at the index
        Entry<K, V> entry = bucket[index];

        // if this entry has the matching key, remove the element at this index
        if (entry.getKey().equals(key)){
            bucket[index] = null;
            elements--;
            return;
        }

        // otherwise, if the next element in the linked list is not null
        while (entry.next != null ) {
            // if the key of the next element in the linked list is not the key we're looking for
            if (entry.next.getKey() != key) {
                // traverse the linked list to the next node
                entry = entry.next;
            }
        }

        // when we exit the loop above, entry.next will contain the key we're looking for
        // if we're deleting from the middle of a linked list we need to link
        // entry.next to entry.next.next - this is basically like turning this list:
        // a -> b -> c
        // into this list:
        // a -> c
        if(entry.next.next != null){
            entry.next = entry.next.next;
            elements--;
            return;
        }
        // otherwise, entry.next is the end of the list so we can just chop it off
        else {
            entry.next = null;
            elements--;
            return;
        }
    }
    public V getKey(K key) {
        // call the hash() method to get the index for the key
        int index = hashM(key);

        // nothing at key - return null
        if (bucket[index] == null) {
            System.out.println("element does not exist");
            return null;
        }

        // otherwise, get the Entry at the index
        Entry<K, V> entry = bucket[index];

        // if the key of the current entry is not the key we're looking for
        // that means we're looking at a linked list and we need to traverse it
        // if the key does match right from the start, this loop will be skipped
        while (entry.getKey() != key) {

            // if we reach the end of the list and haven't found it return null
            if (entry.next == null) {
                return null;
            }

            // otherwise, keep traversing the linked list
            entry = entry.next;
        }

        // if we get here, that means the key has been found, return the value
        return entry.getValue();
    }
    public int getStorageSize() {
        return bucket.length;
    }
    public void cloneHashMap() {
        this.bucket.clone();
    }
}
class Entry<K, V> {
    private K key;
    private V value;
    // it means this is a LinkedList
    Entry next = null;

    Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}