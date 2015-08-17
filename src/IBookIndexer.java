
public interface IBookIndexer {

   public void buildIndex(String bookFilePath, String[] keywords, String indexFilePath);
   String m = "C:\\Indexer\\BookIndex.txt";
   String[] keys = new String [] {"aenean", "loreem"};
   String index = "C:\\Indexer\\WriteIn.txt";
}
