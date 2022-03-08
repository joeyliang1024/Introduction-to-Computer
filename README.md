# 計算機概論作業區
- [java程式教學](https://programming.im.ncnu.edu.tw/J_index.html)
- 第一週作業：
  - 說明：請寫一支由使用者輸入兩個整數，並分別輸出兩數相加與相減的結果
  - Input：兩個整數(int 型態 -1000~1000)
  - Output：先輸出相加後的結果後，換行再輸出相減(第一個減第二個)後的結果
- 第二週作業：
  - 說明：請根據輸入的數據建造一座金字塔！
  - Input：
    - 第一列為一個數字，表示金字塔的高 (此數字最小為3)。
    - 第二列為兩個字符組成的字串，表示金字塔外圈與內部的符號。
  - Output:金字塔
- 第三週作業：
  - 請依照下列的規定，實作出兩個class，Book和BookShelf (屬性property、方法method)
  - Book
    - ![Book]()
    - Book (String NAME , String iSBN , Vector<String> CONTENT)：為建構子，將NAME參數存入屬性Name；iSBN參數存入屬性ISBN； CONTENT參數存入屬性Content
    - String getName ()：回傳屬性Name
    - String getISBN()：回傳屬性ISBN
    - String getContent ( int PAGE )：回傳 Content 屬性中第 PAGE 格的內容 ；如果PAGE >= Content.size()，則回傳「Error」字串
    - void addPage(String SENTENCE)：將SENTENCE加入屬性Content的尾端 (hint: 使用Vector的add, C++ vector的push_back)
  - BookShelf
    - ![BookShelf]()
    - BookShelf ()：為建構子，不做任何事情
    - void addBook ( Book MYBook )：將MYBook加入屬性Shelf的尾端 (hint: 使用Vector的add, C++ vector的push_back)
    - void showBookShelf ()：依序顯示屬性Shelf裡面所有Book的書名、ISBN，並在最前面顯示該Book在Shelf中的哪個位子(位子由0開始計算) (位子、書名、ISBN之間要半形空格，最後換行)
