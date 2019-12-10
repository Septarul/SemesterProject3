using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace BlazorWebApp.Model.Domain
{
    public class Item
    {
        public int id { get; set; }
        [RegularExpression(@"^[A-Z]+[a-zA-Z""'\s-]*$", ErrorMessage = "No numbers or special characters allowed.")]
        [Required]
        [StringLength(100)]
        public string name { get; set; }

        public string category { get; set; }
 
        public float price { get; set; }
        
        public string description { get; set; }

        public string url { get; set; }
        private int Quantity { get; set; }
        private String Quantitytype { get; set; }
        public int nrofitems { get; set; }

    }
}
