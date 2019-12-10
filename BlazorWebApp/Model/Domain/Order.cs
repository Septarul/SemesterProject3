using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace BlazorWebApp.Model.Domain
{
    public class Order
    {
        private int Id { get; set; }
        private int Userid { get; set; }
        [Required]
        private string Adress { get; set; }
        [Required]
        private string Invoiceadress { get; set; }
        private float Totalprice { get; set; }
        [Required]
        [Range(1, 10000, ErrorMessage = "At least 1 item.")]
        private int Totalitems { get; set; }
        [Required]
        private int Phone { get; set; }
        private Boolean Delivered { get; set; }
        private List<Item> Items { get; set; }
        private int[] itemsCount { get; set; }

    }
}
