﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace MiewMiew.Dto
{
    public class UserPickerDto
    {
	    public string Id { get; set; }
	    public string Email { get; set; }
	    public string SecurityStamp { get; set; }
	    public bool TwoFactorEnabled { get; set; }
	    public string UserName { get; set; }
	    public string Salt { get; set; }
	    public DateTime? Created { get; set; }
	    public string Ime { get; set; }
	    public string Prezime { get; set; }
	    public int? Razina { get; set; }
	    public double? Latitude { get; set; }
	    public double? Longitude { get; set; }
	    public bool IsAvailable { get; set; }
	    public double Udaljenost { get; set; }
	}
}
