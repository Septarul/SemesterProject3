#pragma checksum "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\Products.razor" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "fb815b18a91a8b78c6dc5e98fdaeb5f0047d6d4e"
// <auto-generated/>
#pragma warning disable 1591
namespace BlazorWebApp.Pages
{
    #line hidden
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
    using Microsoft.AspNetCore.Components;
#nullable restore
#line 1 "E:\Soft Eng\VisualStudio\BlazorWebApp\_Imports.razor"
using System.Net.Http;

#line default
#line hidden
#nullable disable
#nullable restore
#line 2 "E:\Soft Eng\VisualStudio\BlazorWebApp\_Imports.razor"
using Microsoft.AspNetCore.Authorization;

#line default
#line hidden
#nullable disable
#nullable restore
#line 3 "E:\Soft Eng\VisualStudio\BlazorWebApp\_Imports.razor"
using Microsoft.AspNetCore.Components.Authorization;

#line default
#line hidden
#nullable disable
#nullable restore
#line 4 "E:\Soft Eng\VisualStudio\BlazorWebApp\_Imports.razor"
using Microsoft.AspNetCore.Components.Forms;

#line default
#line hidden
#nullable disable
#nullable restore
#line 5 "E:\Soft Eng\VisualStudio\BlazorWebApp\_Imports.razor"
using Microsoft.AspNetCore.Components.Routing;

#line default
#line hidden
#nullable disable
#nullable restore
#line 6 "E:\Soft Eng\VisualStudio\BlazorWebApp\_Imports.razor"
using Microsoft.AspNetCore.Components.Web;

#line default
#line hidden
#nullable disable
#nullable restore
#line 7 "E:\Soft Eng\VisualStudio\BlazorWebApp\_Imports.razor"
using Microsoft.JSInterop;

#line default
#line hidden
#nullable disable
#nullable restore
#line 8 "E:\Soft Eng\VisualStudio\BlazorWebApp\_Imports.razor"
using BlazorWebApp;

#line default
#line hidden
#nullable disable
#nullable restore
#line 9 "E:\Soft Eng\VisualStudio\BlazorWebApp\_Imports.razor"
using BlazorWebApp.Shared;

#line default
#line hidden
#nullable disable
#nullable restore
#line 2 "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\Products.razor"
using BlazorWebApp.Model.Domain;

#line default
#line hidden
#nullable disable
#nullable restore
#line 3 "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\Products.razor"
using System.Collections;

#line default
#line hidden
#nullable disable
    [Microsoft.AspNetCore.Components.RouteAttribute("/products")]
    public class Products : Microsoft.AspNetCore.Components.ComponentBase
    {
        #pragma warning disable 1998
        protected override void BuildRenderTree(Microsoft.AspNetCore.Components.Rendering.RenderTreeBuilder __builder)
        {
            __builder.AddMarkupContent(0, "<h2>View all products here</h2>\r\n\r\n");
#nullable restore
#line 7 "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\Products.razor"
 if (items == null)
{

#line default
#line hidden
#nullable disable
            __builder.AddContent(1, "    ");
            __builder.AddMarkupContent(2, "<p><em>Loading...</em></p>\r\n");
#nullable restore
#line 10 "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\Products.razor"
}
else
{

#line default
#line hidden
#nullable disable
            __builder.AddContent(3, "    ");
            __builder.OpenElement(4, "table");
            __builder.AddAttribute(5, "class", "table");
            __builder.AddAttribute(6, "style", "width:300px");
            __builder.AddMarkupContent(7, "\r\n        ");
            __builder.AddMarkupContent(8, @"<thead>
            <tr>
                <th>Image</th>
                <th>Name</th>
                <th>Race</th>
                <th>Image</th>
                <th>Name</th>
                <th>Race</th>
                <th>Image</th>
                <th>Name</th>
                <th>Race</th>
            </tr>
        </thead>
        ");
            __builder.OpenElement(9, "tbody");
            __builder.AddMarkupContent(10, "\r\n");
#nullable restore
#line 28 "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\Products.razor"
             for (var z = 0; z < items.Count - 2; z++)
            {

#line default
#line hidden
#nullable disable
            __builder.AddContent(11, "                ");
            __builder.OpenElement(12, "tr");
            __builder.AddMarkupContent(13, "\r\n                    ");
            __builder.OpenElement(14, "td");
            __builder.AddAttribute(15, "width", "33%");
            __builder.OpenElement(16, "img");
            __builder.AddAttribute(17, "src", 
#nullable restore
#line 31 "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\Products.razor"
                                               items[z].Price

#line default
#line hidden
#nullable disable
            );
            __builder.AddAttribute(18, "height", "200");
            __builder.CloseElement();
            __builder.CloseElement();
            __builder.AddMarkupContent(19, "\r\n                    ");
            __builder.OpenElement(20, "td");
            __builder.AddAttribute(21, "width", "33%");
            __builder.AddContent(22, 
#nullable restore
#line 32 "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\Products.razor"
                                     items[z].Name

#line default
#line hidden
#nullable disable
            );
            __builder.CloseElement();
            __builder.AddMarkupContent(23, "\r\n                    ");
            __builder.OpenElement(24, "td");
            __builder.AddAttribute(25, "width", "33%");
            __builder.AddContent(26, 
#nullable restore
#line 33 "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\Products.razor"
                                     items[z].Id

#line default
#line hidden
#nullable disable
            );
            __builder.CloseElement();
            __builder.AddMarkupContent(27, "\r\n                    ");
            __builder.OpenElement(28, "td");
            __builder.AddAttribute(29, "hidden", true);
            __builder.AddContent(30, 
#nullable restore
#line 34 "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\Products.razor"
                                 z++

#line default
#line hidden
#nullable disable
            );
            __builder.CloseElement();
            __builder.AddMarkupContent(31, "\r\n                    ");
            __builder.OpenElement(32, "td");
            __builder.AddAttribute(33, "width", "33%");
            __builder.OpenElement(34, "img");
            __builder.AddAttribute(35, "src", 
#nullable restore
#line 35 "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\Products.razor"
                                               items[z].Price

#line default
#line hidden
#nullable disable
            );
            __builder.AddAttribute(36, "height", "200");
            __builder.CloseElement();
            __builder.CloseElement();
            __builder.AddMarkupContent(37, "\r\n                    ");
            __builder.OpenElement(38, "td");
            __builder.AddAttribute(39, "width", "33%");
            __builder.AddContent(40, 
#nullable restore
#line 36 "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\Products.razor"
                                     items[z].Name

#line default
#line hidden
#nullable disable
            );
            __builder.CloseElement();
            __builder.AddMarkupContent(41, "\r\n                    ");
            __builder.OpenElement(42, "td");
            __builder.AddAttribute(43, "width", "33%");
            __builder.AddContent(44, 
#nullable restore
#line 37 "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\Products.razor"
                                     items[z].Id

#line default
#line hidden
#nullable disable
            );
            __builder.CloseElement();
            __builder.AddMarkupContent(45, "\r\n                    ");
            __builder.OpenElement(46, "td");
            __builder.AddAttribute(47, "hidden", true);
            __builder.AddContent(48, 
#nullable restore
#line 38 "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\Products.razor"
                                 z++

#line default
#line hidden
#nullable disable
            );
            __builder.CloseElement();
            __builder.AddMarkupContent(49, "\r\n                    ");
            __builder.OpenElement(50, "td");
            __builder.AddAttribute(51, "width", "33%");
            __builder.OpenElement(52, "img");
            __builder.AddAttribute(53, "src", 
#nullable restore
#line 39 "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\Products.razor"
                                               items[z].Price

#line default
#line hidden
#nullable disable
            );
            __builder.AddAttribute(54, "height", "200");
            __builder.CloseElement();
            __builder.CloseElement();
            __builder.AddMarkupContent(55, "\r\n                    ");
            __builder.OpenElement(56, "td");
            __builder.AddAttribute(57, "width", "33%");
            __builder.AddContent(58, 
#nullable restore
#line 40 "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\Products.razor"
                                     items[z].Name

#line default
#line hidden
#nullable disable
            );
            __builder.CloseElement();
            __builder.AddMarkupContent(59, "\r\n                    ");
            __builder.OpenElement(60, "td");
            __builder.AddAttribute(61, "width", "33%");
            __builder.AddContent(62, 
#nullable restore
#line 41 "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\Products.razor"
                                     items[z].Id

#line default
#line hidden
#nullable disable
            );
            __builder.CloseElement();
            __builder.AddMarkupContent(63, "\r\n\r\n                ");
            __builder.CloseElement();
            __builder.AddMarkupContent(64, "\r\n");
#nullable restore
#line 44 "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\Products.razor"
            }

#line default
#line hidden
#nullable disable
            __builder.AddMarkupContent(65, "\r\n        ");
            __builder.CloseElement();
            __builder.AddMarkupContent(66, "\r\n    ");
            __builder.CloseElement();
            __builder.AddMarkupContent(67, "\r\n");
#nullable restore
#line 48 "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\Products.razor"

}

#line default
#line hidden
#nullable disable
        }
        #pragma warning restore 1998
#nullable restore
#line 51 "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\Products.razor"
       
    List<Item>
    items { get; set; }

    protected override async Task OnInitializedAsync()
    {
    Task<List<Item>> listAsync =null;
        var cats = listAsync.GetAwaiter().GetResult();
    }

#line default
#line hidden
#nullable disable
    }
}
#pragma warning restore 1591
