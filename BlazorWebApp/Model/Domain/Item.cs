using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace BlazorWebApp.Model.Domain
{
    public class Item
    {
        public int Id { get; set; }
        [RegularExpression(@"^[A-Z]+[a-zA-Z""'\s-]*$")]
        [Required]
        [StringLength(30)]
        public string Name { get; set; }
        [RegularExpression(@"^[A-Z]+[a-zA-Z""'\s-]*$")]
        [Required]
        [StringLength(30)]
        public string Category { get; set; }
        [Range(1, 10000)]
        [DataType(DataType.Currency)]
        [Required]
        public float Price { get; set; }
        [Required]
        [StringLength(250)]
        public string Description { get; set; }
        [Required]
        [StringLength(250)]
        public string Url { get; set; }
        private int Quantity { get; set; }
        private String Quantitytype { get; set; }
        public int Nrofitems { get; set; }

    }
}
