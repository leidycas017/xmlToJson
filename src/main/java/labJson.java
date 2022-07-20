import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class labJson {
    public static int PRETTY_PRINT_IDENT_FACTOR = 4;
    public static String XML_STRING =
            "<?xml version=\"1.0\"?>\n" +
                    " <Catalog>\n" +
                    " <Book id=\"bk101\">\n" +
                    " <Author>Garghentini, Davide</Author>\n" +
                    " <Title>XML Developer's Guide</Title>\n" +
                    " <Genre>Computer</Genre>\n" +
                    " <Price>44.95</Price>\n" +
                    " <PublishDate>2000-10-01</PublishDate>\n" +
                    " <Description>\n" +
                    " An in-depth look at creating applications with XML.\n" +
                    " </Description>\n" +
                    " </Book>\n" +
                    " <Book id=\"bk102\">\n" +
                    " <Author>Garcia, Debra</Author>\n" +
                    " <Title>Midnight Rain</Title>\n" +
                    " <Genre>Fantasy</Genre>\n" +
                    " <Price>5.95</Price>\n" +
                    " <PublishDate>2000-12-16</PublishDate>\n" +
                    " <Description>\n" +
                    " A former architect battles corporate zombies, an evil sorceress, and her own childhood to become" +
                    " queen of the world.</Description>\n" +
                    " </Book>\n" +
                    " </Catalog>";
    /*
    public static String XML_STRING =
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    " <menu_desayuno>\n" +
                    " <opcion>\n" +
                    " <nombre>PanCakes</nombre>\n" +
                    " <valor>$2.95</valor>\n" +
                    " <descripcion>\n" +
                    " Lithuanian Pancake Recipe - Blynai or Sklindziai\n" +
                    " </descripcion>\n" +
                    " <kcal>500</kcal>\n" +
                    " </opcion>\n" +
                    " <opcion>\n" +
                    " <nombre>Belgian Waffles</nombre>\n" +
                    " <valor>$5.95</valor>\n" +
                    " <descripcion>\n" +
                    " Two of our famous Belgian Waffles with plenty of real maple syrup\n" +
                    " </descripcion>\n" +
                    " <kcal>650</kcal>\n" +
                    " </opcion>\n" +
                    " <opcion>\n" +
                    " <nombre>Strawberry Belgian Waffles</nombre>\n" +
                    " <valor>$7.95</valor>\n" +
                    " <descripcion>\n" +
                    " Light Belgian waffles covered with strawberries and whipped cream\n" +
                    " </descripcion>\n" +
                    " <kcal>900</kcal>\n" +
                    " </opcion>\n" +
                    " </menu_desayuno>";

     */

    public static void main(String[] args)
    {
          try {
              JSONObject jsonObject = XML.toJSONObject(XML_STRING);
              String jsonPretty = jsonObject.toString(PRETTY_PRINT_IDENT_FACTOR);
              System.out.print(jsonPretty);
          }catch (JSONException jex)
          {
              System.out.print(jex.toString());
          }

    }
}

