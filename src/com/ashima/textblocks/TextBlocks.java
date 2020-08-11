package com.ashima.textblocks;

@SuppressWarnings("preview")
public class TextBlocks {

	
	public void printtHTMLData() {
		String htmlData = """
                <html>
                   <body>
                     <p>Hello, world</p>
                   </body>
                </html>
                """;
		System.out.println(htmlData);
	}
	
	public void printJSONData() {
		String jsonData = """
				{
				  "data": {
				    "type": "articles",
				    "id": "1",
				    "attributes": {
				      "title": "JSON:API paints my bikeshed!",
				      "body": "The shortest article. Ever."
				    }
				  }
				}
				""";
		System.out.println(jsonData);
	}
	
	public static void main(String[] args) {
		
		TextBlocks textBlocks = new TextBlocks();
		textBlocks.printtHTMLData();
		textBlocks.printJSONData();
		
	}
	
	
}
