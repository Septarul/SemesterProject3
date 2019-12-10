using System;
using System.ComponentModel.DataAnnotations;

namespace BlazorWebApp.Model.Domain
{
    public class User
    {

        public int Id { get; set; }
      
        [Required]
        [StringLength(30)]
        public string Username { get; set; }
        [RegularExpression(@"^[A-Z]+[a-zA-Z""'\s-]*$", ErrorMessage = "No numbers or special characters allowed.")]
        [Required]
        [StringLength(30)]
        public string Fullname { get; set; }

        [Required]
        [StringLength(50)]
        public string Email { get; set; }

        [Required]
        [StringLength(50)]
        public string Password { get; set; }

        public string Role { get; set; }
    }
}
