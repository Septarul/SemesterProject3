#pragma checksum "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\Pages\TestSubmit.razor" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "f842f03ab6cee15cc11df210ff82515ebd03841e"
// <auto-generated/>
#pragma warning disable 1591
#pragma warning disable 0414
#pragma warning disable 0649
#pragma warning disable 0169

namespace BlazorWebApp.Pages
{
    #line hidden
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
    using Microsoft.AspNetCore.Components;
#nullable restore
#line 1 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\_Imports.razor"
using System.Net.Http;

#line default
#line hidden
#nullable disable
#nullable restore
#line 2 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\_Imports.razor"
using Microsoft.AspNetCore.Authorization;

#line default
#line hidden
#nullable disable
#nullable restore
#line 3 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\_Imports.razor"
using Microsoft.AspNetCore.Components.Authorization;

#line default
#line hidden
#nullable disable
#nullable restore
#line 4 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\_Imports.razor"
using Microsoft.AspNetCore.Components.Forms;

#line default
#line hidden
#nullable disable
#nullable restore
#line 5 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\_Imports.razor"
using Microsoft.AspNetCore.Components.Routing;

#line default
#line hidden
#nullable disable
#nullable restore
#line 6 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\_Imports.razor"
using Microsoft.AspNetCore.Components.Web;

#line default
#line hidden
#nullable disable
#nullable restore
#line 7 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\_Imports.razor"
using Microsoft.JSInterop;

#line default
#line hidden
#nullable disable
#nullable restore
#line 8 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\_Imports.razor"
using BlazorWebApp;

#line default
#line hidden
#nullable disable
#nullable restore
#line 9 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\_Imports.razor"
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
        }
        #pragma warning restore 1998
#nullable restore
#line 10 "C:\Users\Sprite\Desktop\SEP3\SemesterProject3\BlazorWebApp\Pages\TestSubmit.razor"
       

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
