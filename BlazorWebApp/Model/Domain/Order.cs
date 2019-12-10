using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace BlazorWebApp.Model.Domain
{
    public class Order
    {

        private int Id;
        [Required]
        private string Adress;
        [Required]
        private string Invoiceadress;

        private float Totalprice;
        [Required]
        [Range(1, 10000,ErrorMessage ="At least 1 item.")]
        private int Totalitems;
        [Required]
        private int Phone;

    }
}
