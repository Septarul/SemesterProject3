using BlazorWebApp.Model.Domain;
using Microsoft.AspNetCore.Components;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

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
        List<Item> trophies = new List<Item>
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
