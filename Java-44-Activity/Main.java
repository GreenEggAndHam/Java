import java.io.IOException;
import java.sql.*;
/*
Use the chinook database to write the SQL statements to produce the info asked (using chinookDBdiagram.jpg to decide which tables contain the required info and their relationships)

java -cp sqlite-jdbc-3.23.1.jar: Main
*/
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {

    String sql = "";
    String result ="";     
		Database db = new Database("jdbc:sqlite:chinook.db");	

    // Problem 1:
    // For the first 30 tracks, get the name of the track and the album name that it belongs to.
    sql = "SELECT name, title FROM tracks Inner Join albums ON tracks.albumid = albums.albumid LIMIT 30; ";
    result = db.runSQL(sql, "table-auto");
    print (result);

    // Problem 2:
    // // For every Invoice in April 2012, retrieve the customer's first name & last name, invoice id, and invoice date.  (Invoice date format: YYYY-MM-DD)
    sql = "SELECT firstname,lastname,invoiceid,invoicedate FROM customers,invoices WHERE invoicedate LIKE '2012-04%'AND invoices.customerid = customers.customerid;";
    result = db.runSQL(sql, "table-auto");
    print (result);

    // Problem 3:
    // For the first 20 invoices, get the customer id, invoice id, track name, unit price and quantity. (Hint: information is across 3 tables)
sql = "SELECT customerid, invoiceid, name, unitprice, quantity FROM tracks,invoices,invoice_items WHERE invoices.invoiceid = invoice_items.invoiceid AND invoice_items.trackid = tracks.trackid LIMIT 20;";
   result = db.runSQL(sql, "table-auto");
    print (result);

    // Problem 4:
    // What is the list of customer names whose merchandise is being shipped either to the USA, Germany or Poland? (Hint: use BillingCountry in invoices table). (REMOVE DUPLICATES)
sql = "SELECT customername FROM customers"

    // Problem 5:
    // List the first 20 song(track) names that are “Latin” music (genre)?


    // Problem 6:
    // List all the “Jazz” album titles. 'Jazz' is a genre. (REMOVE DUPLICATES)


    // Problem 7:
    // List all the Pop Artist names. 'Pop' is a genre. (REMOVE DUPLICATES)
  
      
  }    
}