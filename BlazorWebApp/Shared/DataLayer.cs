using BlazorWebApp.Model.Domain;
using Microsoft.AspNetCore.Components;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using BlazorWebApp.Model.Domain;
using System.Net.Http.Headers;
using System.Runtime.Serialization.Json;
using System.Net.Http;

namespace BlazorWebApp.Shared
{
    public interface IDataLayer
    {
        IList<Item> AllTrophies();
        Item TrophyById(int id);
        Item TrophyForEditing(int id);
        void SubmitChanges(Item item);
    }

    public class DataLayer : IDataLayer
    {
        HttpClient client;
        public IList<Item> AllTrophies() => trophies;
        public Item TrophyById(int id) => trophies.SingleOrDefault(t => t.id == id);
        public Item CloneTrophy(Item source) => new Item
        {
            id = source.id,
            name = source.name,
            url = source.url,
        };
        public Item TrophyForEditing(int id) => CloneTrophy(TrophyById(id));
        public void SubmitChanges(Item changed)
        {
            var original = TrophyById(changed.id);
            original.name = changed.name;
            original.url = changed.url;

        }

        public List<Item> trophies;

        public async void requestAllItems()
        {

            var serializer = new DataContractJsonSerializer(typeof(List<Item>));
            // JavaScriptSerializer json_serializer = new JavaScriptSerializer();
            client.DefaultRequestHeaders.Accept.Clear();
            client.DefaultRequestHeaders.Accept.Add(
               new MediaTypeWithQualityHeaderValue("application/vnd.github.v3+json"));

            client.DefaultRequestHeaders.Add("User-Agent", ".NET Foundation Repository Reporter");


            string uri = "http://localhost:8080/items";

            var streamTask = client.GetStreamAsync(uri);

            trophies = serializer.ReadObject(await streamTask) as List<Item>;
            // User usera = serializer.ReadObject(await streamTask) as User;

            //User usera = json_serializer.Deserialize<User>(streamTask.Result);
        }


        List<Item> items = new List<Item>
    {
      new Item{
        id =1,
        name ="Rubber Chicken",
        url ="Monkey Island",

      },
      new Item{
        id =2,
        name ="Rubber Chicken",
        url ="Monkey Island",
      },
      new Item{
        id =3,
        name ="Rubber Chicken",
        url ="Monkey Island",
      },
      new Item{
        id =4,
        name ="asa faci",
        url ="Sa moara viata",
      }
    };

    }
}
