package algorithm.search;

public class HashSearch implements SearchSolution{
    @Override
    public int solution(int[] array, int target) {
        int hash = 21;

        int [] hashArray = new int[hash];

        for (int i = 0; i < array.length; i++){
            insertHash(hashArray, hash, array[i]);
        }

        int result = searchHash(hashArray, target, hash);

        return result;
    }

    private void insertHash(int [] hashArray, int data, int hash){
        int hashAddress = data % hash;

        while (hashArray[hashAddress] != 0){
            hashAddress = (++hashAddress) % hash;
        }

        hashArray[hashAddress] = data;
    }

    private int searchHash(int [] hashArray, int target, int hash){
        int hashAddress = target % hash;

        while (hashArray[hashAddress] != 0 && hashArray[hashAddress] != target){
            hashAddress = (++hashAddress) % hash;
        }

        if (hashArray[hashAddress] == 0){
            return -1;
        }

        return hashAddress;
    }
}
