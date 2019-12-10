#pragma checksum "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\TestSubmit.razor" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "f842f03ab6cee15cc11df210ff82515ebd03841e"
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
    [Microsoft.AspNetCore.Components.RouteAttribute("/Test")]
    public class TestSubmit : Microsoft.AspNetCore.Components.ComponentBase
    {
        #pragma warning disable 1998
        protected override void BuildRenderTree(Microsoft.AspNetCore.Components.Rendering.RenderTreeBuilder __builder)
        {
            __builder.AddMarkupContent(0, "<h1>Test</h1>\r\n\r\n\r\n");
            __builder.OpenElement(1, "button");
            __builder.AddAttribute(2, "class", "btn btn-primary");
            __builder.AddAttribute(3, "onclick", Microsoft.AspNetCore.Components.EventCallback.Factory.Create<Microsoft.AspNetCore.Components.Web.MouseEventArgs>(this, 
#nullable restore
#line 7 "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\TestSubmit.razor"
                                          Login

#line default
#line hidden
#nullable disable
            ));
            __builder.AddContent(4, "Login");
            __builder.CloseElement();
            __builder.AddMarkupContent(5, "\r\n");
            __builder.OpenElement(6, "button");
            __builder.AddAttribute(7, "class", "btn btn-primary");
            __builder.AddAttribute(8, "onclick", Microsoft.AspNetCore.Components.EventCallback.Factory.Create<Microsoft.AspNetCore.Components.Web.MouseEventArgs>(this, 
#nullable restore
#line 8 "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\TestSubmit.razor"
                                          Logout

#line default
#line hidden
#nullable disable
            ));
            __builder.AddContent(9, "Logout");
            __builder.CloseElement();
        }
        #pragma warning restore 1998
#nullable restore
#line 10 "E:\Soft Eng\VisualStudio\BlazorWebApp\Pages\TestSubmit.razor"
       

    public async Task Login()
    {
        Console.WriteLine("Login here");
        var interop = new Interop(jsRuntime);
        string antiforgerytoken = await interop.GetElementByName("__RequestVerificationToken");
        string Username = "Troels";
        string Password = "pw";
        
        // Here I provide fields matching the arguments of my login method
        var fields = new { __RequestVerificationToken = antiforgerytoken, username = Username, password = Password};
        await interop.SubmitForm("/loginRequester/", fields);
    }

    public async Task Logout() {
        Console.WriteLine("Logout here");
        var interop = new Interop(jsRuntime);
        string antiforgerytoken = await interop.GetElementByName("__RequestVerificationToken");
        
        // Here I provide fields matching the arguments of my logout method, i.e. none
        var fields = new {__RequestVerificationToken = antiforgerytoken};
        await interop.SubmitForm("/logoutRequester/", fields);
    }

#line default
#line hidden
#nullable disable
        [global::Microsoft.AspNetCore.Components.InjectAttribute] private IJSRuntime jsRuntime { get; set; }
    }
}
#pragma warning restore 1591
