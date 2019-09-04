# Watch Shop

This is the first exercise of SOP subject.

### End points
- `GET` \product\all

   Get all products list
   
   ```json
  [
    {
      "id": 1,
      "productName": "Mens Hugo Boss Watch 1513394",
      "brand": "Hugo Boss",
      "price": 400.0,
      "content": "Hugo Boss 1513394 is an amazing and very impressive Gents watch. Material of the case is Stainless Steel while the dial colour is White. In regards to the water resistance, the watch has got a resistancy up to 50 metres. It means it can be submerged in water for periods, so can be used for swimming and fishing. It is not reccomended for high impact water sports. We ship it with an original box and a guarantee from the manufacturer.",
      "imageURL": "https://d1rkccsb0jf1bk.cloudfront.net/products/100029622/main/large/1513394.jpg"
    },
    {
      "id": 2,
      "productName": "Mens Casio Edifice Bluetooth Triple Connect Toro Rosso Special Edition Alarm Chronograph Watch EQB-800TR-1AER",
      "brand": "Casio",
      "price": 560.0,
      "content": "The Casio Edifice Bluetooth Triple Connect Toro Rosso Special Edition EQB-800TR-1AER is an amazing and attractive Gents watch. The latest iteration of Casio's Edifice family includes their new Triple Connect system, linking to radio time signals, GPS and Bluetooth to ensure your watch is constantly accurate, and display the time in over 300 city time zones around the world. ",
      "imageURL": "https://d1rkccsb0jf1bk.cloudfront.net/products/100014542/main/large/eqb-800tr-1aer-1500993057-2485.jpg"
    },
    {
      "id": 4,
      "productName": "productName",
      "brand": "brand",
      "price": 5.0,
      "content": "content",
      "imageURL": "imageURL5"
    }
  ]
  ```
  
 - `POST` \product\add
    
    Add product to watch shop.
    
    **Request**
    ```json
   {
   	"productName": "Mens Citizen Watch AW1530-65E",
   	"brand": "Citizen",
   	"price": 259.0,
   	"content": "Citizen AW1530-65E is an amazing and handsome Gents watch.",
   	"imageURL": "https://d1rkccsb0jf1bk.cloudfront.net/products/100002337/main/large/aw1530-65e_bracelet_high_res-1467210908-6942.jpg"
   }
   ```
   
   **Response**
   ```json
    {
      "Success": true|false
    }
   ```
   
 - `POST` \product\remove?id={product_id}
   
   Remove product by product_id from watch shop.
   
   **Response**
   ```json
       {
         "Success": true|false
       }
   ```
   